package com.springaction.part01.test;

import org.springframework.stereotype.Component;

@Component("testLenvoComputer")
public class LenvoComputer implements Computer{

    private String name = "lenvo computer";

    @Override
    public void printName() {

        System.out.println(this.name);
    }
}
