package com.design.proxy.statc;

/**
 * Created by lssemail on 2018/1/18.
 */
public class Test {

    public static void main(String[] args) {
        Star star = new Star();

        StarProxy proxy = new StarProxy(star);
        proxy.discuss();
    }
}
