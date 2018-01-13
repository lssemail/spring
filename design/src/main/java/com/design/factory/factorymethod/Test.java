package com.design.factory.factorymethod;

/**
 * Created by lssemail on 2018/1/13.
 */
public class Test {

    public static void main(String[] args) {
        FactoryBMW factoryBMW = new FactoryBMW320();
        factoryBMW.createBMW();
    }
}
