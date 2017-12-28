package com.springaction.part01.concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lssemail on 2017/12/28.
 */
public class AudienceMain {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("concert.xml");

        Performance performance = context.getBean(PerformanceImpl.class);
        performance.perform();


    }
}
