package com.design.singleton;

/**
 * Created by lssemail on 2018/1/12.
 */
public class Test {

    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        singleton01.print();

        Singleton02 singleton02 = Singleton02.getInstance();

        SingletonEnum.instance.method();

    }
}
