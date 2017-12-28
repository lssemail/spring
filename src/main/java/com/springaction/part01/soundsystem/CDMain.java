package com.springaction.part01.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lssemail on 2017/12/9.
 */
public class CDMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("compactDisc.xml");
        BlankDisc blankDisc = context.getBean(BlankDisc.class);
        blankDisc.play();

        blankDisc.play(1);

        System.out.println(context.getBean("site"));
        System.out.println(context.getBean("globel"));
        context.close();
    }
}
