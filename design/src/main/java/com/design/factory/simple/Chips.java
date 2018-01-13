package com.design.factory.simple;

/**
 * Created by lssemail on 2018/1/13.
 */
public class Chips implements Food {

    @Override
    public void get() {
        System.out.println("一份薯条");
    }
}
