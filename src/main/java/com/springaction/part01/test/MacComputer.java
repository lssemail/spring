package com.springaction.part01.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MacComputer implements Computer{

    @Autowired
    ComputerFactory factory;

    private String name = "mac computer";

    @Override
    public void printName() {

        factory.getInstance();
        System.out.println(this.name);
    }
}
