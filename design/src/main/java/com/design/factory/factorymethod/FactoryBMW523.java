package com.design.factory.factorymethod;

/**
 * Created by lssemail on 2018/1/13.
 */
public class FactoryBMW523 implements FactoryBMW {

    @Override
    public BMW createBMW() {
        return new BMW523();
    }
}
