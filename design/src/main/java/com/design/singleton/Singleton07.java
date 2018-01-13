package com.design.singleton;

/**
 * Created by lssemail on 2018/1/12.
 * 内部类[推荐用]
 * 类的静态属性只会在第一次加载类的时候初始化
 */
public class Singleton07 {

    private Singleton07(){}

    private static class SingletonHolder{
        private static Singleton07 instance = new Singleton07();
    }

    public static Singleton07 getIntance(){
        return SingletonHolder.instance;
    }
}
