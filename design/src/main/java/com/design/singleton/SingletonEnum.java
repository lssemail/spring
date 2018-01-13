package com.design.singleton;

/**
 * Created by lssemail on 2018/1/12.
 * 枚举[极推荐使用]
 */
public enum SingletonEnum {

    instance;

    private SingletonEnum(){}

    public void method(){

        System.out.println("SingletonEnum");
    }
}
