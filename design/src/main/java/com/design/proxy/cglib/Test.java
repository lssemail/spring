package com.design.proxy.cglib;

/**
 * Created by lssemail on 2018/1/18.
 */
public class Test {

    public static void main(String[] args) {
        UserDao target = new UserDao();
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        proxy.save();
    }
}
