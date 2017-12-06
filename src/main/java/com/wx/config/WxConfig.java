package com.wx.config;

/**
 * Created by lssemail on 2017/12/6.
 */
public class WxConfig {

    private static final String URL_WEB_BASE = "http://lssemail.free.ngrok.cc";

    private static final String URL_WX_BASE = "https://api.weixin.qq.com";

    private static final String APP_ID = "wx54dc749391cc123b";

    private static final String APPSECRET = "74d11dd648d4d9739cd1811724a9f341";

    public static final String GLOBEL_ACCESS_TOKEN = "N7pZ3LWG1K4cKL5QuPIVAHAanmZirgPHMRnNMmtXDpUP4SzGW-CXzTE_1nIlqt--2YpK0hhOWTzuIUY_U2Trp_hognjYZuWeDwkmMLLCiDN-Jgqy9XQh7oaYkNzpQZIFOAFhADAXJO";

    /** 获取 access_token的url
     * https请求方式: GET
     * https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET
     */
    public static final String URL_ACCESS_TOKEN = URL_WX_BASE + "/cgi-bin/token?grant_type=client_credential&appid=" + APP_ID + "&secret=" + APPSECRET;

    public static final String ACCESS_TOKEN = "MyKYmo6C08Q0nVHhhOQnUAPZqHChhFTsZyaiDTz8kiQih5m6OPhSM1NitKcEJilmht_4TTetoy9yzxFCSBbCYW-VIQjUpvdw7SWSNzsGVbgw8lM20o9WXKqcp3XkKMJ2ILObAFARUX";

    public static final String URL_ACCRED_PAGE = "https://open.weixin.qq.com/connect/oauth2/authorize" +
            "?appid=" + APP_ID + "&redirect_uri=" + URL_WEB_BASE + "/wx/code" +
            "&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect";

    public static final String URL_ACCESS_TOEKN_BY_CODE = "https://api.weixin.qq.com/sns/oauth2/access_token" +
            "?appid="+ APP_ID +"&secret="+ APPSECRET +"&code=CODE&grant_type=authorization_code";

    public static final String URL_USER_INFO_BY_TOEKN = "https://api.weixin.qq.com/sns/userinfo" +
            "?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";

    public static final String URL_TEMPLATE_MSG = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
}
