package com.design.singleton;

/**
 * Created by lssemail on 2018/1/12.
 * 单例模式的懒汉式[线程不安全，不可用]
 */
public class Singleton03 {

    private static Singleton03 instance = null;

    private Singleton03(){}

    public static Singleton03 getInstance(){

        if(instance == null){
            instance = new Singleton03();
        }
        return instance;
    }
}
