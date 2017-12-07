package com.wx;

import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.xstream.XStream;
import com.util.*;
import com.wx.config.WxConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping("/wx")
public class WxController {

    @Autowired
    WxCustomservice wxCustomservice;

    /**
     *
     * @param signature 微信加密签名
     * @param timestamp 时间戳
     * @param nonce 随机数
     * @param echostr 随机字符串
     * @return
     */
    @RequestMapping(value = "/validateUrl", method = RequestMethod.GET)
    @ResponseBody
    public String validateUrl(@RequestParam String signature, @RequestParam Long timestamp,
                      @RequestParam String nonce, @RequestParam String echostr){

        System.out.printf(signature);
        System.out.printf(echostr);

        return echostr;
    }

    @RequestMapping(value = "/validateUrl", method = RequestMethod.POST)
    @ResponseBody
    public void back(Model model, HttpServletRequest request, HttpServletResponse response){
        boolean isGet = request.getMethod().toLowerCase().equals("get");
        if(isGet){
            System.out.println("enter get");
        }else {
            System.out.println("enter post");
            try {
                // 接收消息并返回消息
                acceptMessage(request, response);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 第一步：用户同意授权，获取code
     * @return
     */
    @RequestMapping(value = "/accreditPage", method = RequestMethod.GET)
    public ModelAndView toAccreditPage(){

        return new ModelAndView("redirect:" + WxConfig.URL_ACCRED_PAGE);
    }

    /**
     * 第二步：通过code换取网页授权access_token
     * @return
     */
    @RequestMapping(value = "/code", method = RequestMethod.GET)
    public ModelAndView getCode(@RequestParam String code){

        String url = WxConfig.URL_ACCESS_TOEKN_BY_CODE;
        url = url.replace("CODE", code);
        System.out.println(url);
        String str = HttpClientUtil.doGet(url);
        JSONObject jsonObject = JSONObject.parseObject(str);
        System.out.println(jsonObject);
        String access_token = jsonObject.getString("access_token");
        String openid = jsonObject.getString("openid");

        System.out.println("access_token:\t" + access_token);
        System.out.println("refresh_token:\t" + jsonObject.getString("refresh_token"));
        System.out.println("scope:\t" + jsonObject.getString("scope"));
        System.out.println("openid:\t" + openid);

        JSONObject userInfo = getUserInfo(access_token, openid);
        ModelAndView mdv = new ModelAndView("userInfo");
            mdv.addObject("userInfo", userInfo);
        return mdv;
    }

    private JSONObject getUserInfo(String access_token, String openid){

        String url = WxConfig.URL_USER_INFO_BY_TOEKN;
            url = url.replace("ACCESS_TOKEN", access_token);
            url = url.replace("OPENID", openid);
        String str = HttpClientUtil.doGet(url);
        JSONObject jsonObject = JSONObject.parseObject(str);
        return jsonObject;
    }

    @RequestMapping(value = "/send/template" ,method = RequestMethod.GET)
    @ResponseBody
    public String sendTemplate(){

        String url = WxConfig.URL_TEMPLATE_MSG;
        url = url.replace("ACCESS_TOKEN", WxConfig.GLOBEL_ACCESS_TOKEN);
        JSONObject params = new JSONObject();
            params.put("touser", "oTiSTxB32df1i65grhmJ7yD7k1M4");
            params.put("template_id", "DAYV80VGUvh9vI02-7kIGiCleP-3DMrfbvknXhQMcZE");
            params.put("url", "http://lssemail.free.ngrok.cc/");
            params.put("topcolor", "#FF0000");

        JSONObject data = new JSONObject();
            params.put("data", data);

            JSONObject firstJSON = new JSONObject();
                firstJSON.put("value", "hcky");
                firstJSON.put("color", "#173177");
            data.put("first", firstJSON);
            JSONObject keyword1JSON = new JSONObject();
                keyword1JSON.put("value", "xztx");
                keyword1JSON.put("color", "#173177");
            data.put("keyword1", keyword1JSON);
            JSONObject keyword2JSON = new JSONObject();
                keyword2JSON.put("value", "1111");
                keyword2JSON.put("color", "#173177");
            data.put("keyword2", keyword2JSON);
            JSONObject remarkJSON = new JSONObject();
                remarkJSON.put("value", "wmmthqh");
                remarkJSON.put("color", "#173177");
            data.put("remark", remarkJSON);

        System.out.println(params);
        String result = HttpClientUtil.doPost(url, params.toJSONString());
        System.out.println(result);
        return result;
    }

    //http://www.knowsky.com/983591.html
    private void acceptMessage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 处理接收消息
        ServletInputStream in = request.getInputStream();
        // 将POST流转换为XStream对象
        XStream xs = SerializeXmlUtil.createXstream();
        xs.processAnnotations(InputMessage.class);
        xs.processAnnotations(OutputMessage.class);
        // 将指定节点下的xml节点数据映射为对象
        xs.alias("xml", InputMessage.class);
        // 将流转换为字符串
        StringBuilder xmlMsg = new StringBuilder();
        byte[] b = new byte[4096];
        for (int n; (n = in.read(b)) != -1;) {
            xmlMsg.append(new String(b, 0, n, "UTF-8"));
        }
        // 将xml内容转换为InputMessage对象
        InputMessage inputMsg = (InputMessage) xs.fromXML(xmlMsg.toString());

        String servername = inputMsg.getToUserName();// 服务端
        String custermname = inputMsg.getFromUserName();// 客户端
        long createTime = inputMsg.getCreateTime();// 接收时间
        Long returnTime = Calendar.getInstance().getTimeInMillis() / 1000;// 返回时间

        // 取得消息类型
        String msgType = inputMsg.getMsgType();
        // 根据消息类型获取对应的消息内容
        if (msgType.equals(MsgType.Event.toString())) {
            // 文本消息
            System.out.println("开发者微信号：" + inputMsg.getToUserName());
            System.out.println("发送方帐号：" + inputMsg.getFromUserName());
            System.out.println("消息创建时间：" + inputMsg.getCreateTime() + new Date(createTime * 1000l));
            System.out.println("消息内容：" + inputMsg.getContent());
            System.out.println("消息Id：" + inputMsg.getMsgId());

            StringBuffer str = new StringBuffer();
            str.append("<xml>");
            str.append("<ToUserName><![CDATA[" + custermname + "]]></ToUserName>");
            str.append("<FromUserName><![CDATA[" + servername + "]]></FromUserName>");
            str.append("<CreateTime>" + returnTime + "</CreateTime>");
            str.append("<MsgType><![CDATA[" + msgType + "]]></MsgType>");
            str.append("<Content><![CDATA[你说的是：" + inputMsg.getContent() + "，吗？]]></Content>");
            str.append("</xml>");
            System.out.println(str.toString());
            response.getWriter().write(str.toString());
        }
        // 获取并返回多图片消息
        if (msgType.equals(MsgType.Image.toString())) {
            System.out.println("获取多媒体信息");
            System.out.println("多媒体文件id：" + inputMsg.getMediaId());
            System.out.println("图片链接：" + inputMsg.getPicUrl());
            System.out.println("消息id，64位整型：" + inputMsg.getMsgId());

            OutputMessage outputMsg = new OutputMessage();
            outputMsg.setFromUserName(servername);
            outputMsg.setToUserName(custermname);
            outputMsg.setCreateTime(returnTime);
            outputMsg.setMsgType(msgType);
            ImageMessage images = new ImageMessage();
            images.setMediaId(inputMsg.getMediaId());
            outputMsg.setImage(images);
            System.out.println("xml转换：/n" + xs.toXML(outputMsg));
            response.getWriter().write(xs.toXML(outputMsg));

        }
    }

    @RequestMapping(value = "/kefu/add", method = RequestMethod.GET)
    @ResponseBody
    public String addKefu(){

        String result = wxCustomservice.add();
        return result;
    }

}
