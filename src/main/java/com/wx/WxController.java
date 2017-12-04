package com.wx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/wx")
public class WxController {

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
}
