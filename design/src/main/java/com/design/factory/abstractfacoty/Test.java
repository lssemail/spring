package com.design.factory.abstractfacoty;

/**
 * Created by lssemail on 2018/1/13.
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactory factory = new FactoryBMW320();
        factory.createEngine();
        factory.createAircondition();
    }

}
