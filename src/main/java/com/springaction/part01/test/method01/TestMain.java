package com.springaction.part01.test.method01;

import com.springaction.part01.test.Computer;
import com.springaction.part01.test.LenvoComputer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AutoWiredComputerConfig.class);
        Computer computer = context.getBean(Computer.class);
        computer.printName();
        LenvoComputer lenvoComputer = (LenvoComputer)context.getBean("testLenvoComputer");
        lenvoComputer.printName();
    }

}
