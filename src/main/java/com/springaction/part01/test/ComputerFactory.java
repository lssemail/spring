package com.springaction.part01.test;

import org.springframework.stereotype.Component;

@Component
public class ComputerFactory {


    public void getInstance(){
        System.out.println("factory working");
    }
}
