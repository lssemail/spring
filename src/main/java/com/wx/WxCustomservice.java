package com.wx;

import com.alibaba.fastjson.JSONObject;
import com.util.HttpClientUtil;
import com.wx.config.WxConfig;
import org.springframework.stereotype.Service;

/**
 * Created by lssemail on 2017/12/7.
 * 微信客服模块
 */
@Service
public class WxCustomservice {

    public String add(){
        String url = WxConfig.URL_KF_ADD;
        url = url.replace("ACCESS_TOKEN", WxConfig.GLOBEL_ACCESS_TOKEN);

        JSONObject params = new JSONObject();
            params.put("kf_account", "kusion@gh_eb77e02a4ccc");
            params.put("nickname", "kusion");

        String result = HttpClientUtil.doPost(url, params.toJSONString());
        return result;
    }
}
