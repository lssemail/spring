package com.design.proxy.jdk;

import com.design.proxy.statc.Star;
import com.design.proxy.statc.UserPerform;

/**
 * Created by lssemail on 2018/1/18.
 */
public class Test {

    public static void main(String[] args) {

        UserPerform star = new Star();

        UserPerform starProxy = (UserPerform) (new ProxyFactory(star).getProxyInstance());

        starProxy.discuss();
    }
}
