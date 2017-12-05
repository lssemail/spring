package com.springaction.part01.knight;

import com.springaction.part01.knight.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("knights.xml");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
