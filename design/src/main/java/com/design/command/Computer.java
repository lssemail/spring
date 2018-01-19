package com.design.command;

/**
 * Created by lssemail on 2018/1/19.
 */
public class Computer implements Action {

    @Override
    public void on() {

        System.out.println(Computer.class.getSimpleName() + "on");
    }

    @Override
    public void off() {

        System.out.println(Computer.class.getSimpleName() + "off");
    }
}
