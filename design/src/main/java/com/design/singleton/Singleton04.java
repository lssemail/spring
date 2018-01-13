package com.design.singleton;

/**
 * Created by lssemail on 2018/1/12.
 * 懒汉式线程安全的[线程安全，效率低不推荐使用]
 */
public class Singleton04 {

    private static Singleton04 instance = null;

    private Singleton04(){}

    public static synchronized Singleton04 getInstance(){

        if(instance == null){
            instance = new Singleton04();
        }
        return instance;
    }

}
