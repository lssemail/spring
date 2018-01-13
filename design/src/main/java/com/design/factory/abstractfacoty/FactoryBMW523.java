package com.design.factory.abstractfacoty;

/**
 * Created by lssemail on 2018/1/13.
 */
public class FactoryBMW523 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
