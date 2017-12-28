package com.springaction.part01.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by lssemail on 2017/12/28.
 */
@Aspect
public class Audience2 {

    @Pointcut("execution(* com.springaction.part01.concert.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            joinPoint.proceed();
            System.out.println("CLAP CLAP");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }

    }



}
