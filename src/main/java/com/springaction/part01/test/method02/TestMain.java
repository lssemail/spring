package com.springaction.part01.test.method02;

import com.springaction.part01.test.MiComputer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComputerJavaConfig.class);
        MiComputer miComputer = context.getBean(MiComputer.class);
        miComputer.printName();
    }
}
