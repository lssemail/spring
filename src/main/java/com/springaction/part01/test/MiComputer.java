package com.springaction.part01.test;

import org.springframework.stereotype.Component;

@Component
public class MiComputer implements Computer{

    private LenvoComputer lenvoComputer;

    public MiComputer(LenvoComputer lenvoComputer){
        this.lenvoComputer = lenvoComputer;
    }

    @Override
    public void printName() {

        System.out.println("mi computer");

        lenvoComputer.printName();
    }
}
