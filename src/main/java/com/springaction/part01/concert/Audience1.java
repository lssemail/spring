package com.springaction.part01.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by lssemail on 2017/12/28.
 */
@Aspect
public class Audience1 {

    @Pointcut("execution(** com.springaction.part01.concert.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void taskSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP");
    }

    @AfterReturning("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

}
