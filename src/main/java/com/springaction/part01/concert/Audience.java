package com.springaction.part01.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by lssemail on 2017/12/28.
 */
@Aspect
public class Audience {

    @Before("execution(** com.springaction.part01.concert.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("execution(** com.springaction.part01.concert.Performance.perform(..))")
    public void taskSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("execution(** com.springaction.part01.concert.Performance.perform(..))")
    public void applause(){
        System.out.println("CLAP CLAP");
    }

    @AfterThrowing("execution(** com.springaction.part01.concert.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

}
