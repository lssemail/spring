package com.design.singleton;

/**
 * Created by lssemail on 2018/1/12.
 * 单例模式-懒汉模式
 */
public class Singleton01 {

    private Singleton01(){}

    private static Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance(){

        return instance;
    }

    public void print(){
        System.out.println("我是单例模式的懒汉模式");
    }
}
