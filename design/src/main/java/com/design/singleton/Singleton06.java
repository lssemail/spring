package com.design.singleton;

/**
 * Created by lssemail on 2018/1/12.
 * 单例模式懒汉式双重校验锁[推荐用]
 * Double-Check概念对于多线程开发者来说不会陌生，如代码中所示，我们进行了两次if (instance== null)检查，这样就可以保证
 * 线程安全了。这样，实例化代码只用执行一次，后面再次访问时，判断if (instance== null)，直接return实例化对象。
 * 线程安全；延迟加载；效率较高。
 */
public class Singleton06 {

    private static Singleton06 instance = null;

    private Singleton06(){}

    public static Singleton06 getInstance(){
        if(instance == null){
            synchronized (Singleton06.class){
                if(instance == null){
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}
