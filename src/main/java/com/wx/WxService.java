package com.wx;

import com.alibaba.fastjson.JSONObject;
import com.util.HttpClientUtil;
import com.wx.config.WxConfig;
import org.springframework.stereotype.Service;

/**
 * Created by lssemail on 2017/12/6.
 */
@Service
public class WxService {

    /**
     * 获取access_token
     * @return
     */
    public static JSONObject getAccessToken(){

        String url = WxConfig.URL_ACCESS_TOKEN;
        String result = HttpClientUtil.doGet(url);
        JSONObject jsonObject = JSONObject.parseObject(result);
        return jsonObject;

    }

    public static void main(String[] args) {
        System.out.println(getAccessToken());
    }
}
