package com.design.decorator;

/**
 * Created by lssemail on 2018/1/18.
 */
public class Man implements Person {

    @Override
    public void eat() {
        System.out.println(Man.class.getSimpleName() + "eating!!!");
    }
}
