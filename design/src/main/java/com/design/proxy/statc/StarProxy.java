package com.design.proxy.statc;

/**
 * Created by lssemail on 2018/1/18.
 * 优点:可以做到在不修改目标对象的功能前提下,对目标功能扩展
 * 缺点:因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 */
public class StarProxy implements UserPerform{

    private Star star;

    public StarProxy(Star star){
        this.star = star;
    }

    @Override
    public void discuss() {
        System.out.println("我是助理");
        star.discuss();
    }
}
