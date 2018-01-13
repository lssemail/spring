package com.design.singleton;

/**
 * Created by lssemail on 2018/1/12.
 * 懒汉式[线程不安全，不可用]
 */
public class Singleton05 {

    private static Singleton05 instance = null;

    public static Singleton05 getInstance(){

        if(instance == null){
            synchronized (Singleton05.class){
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
