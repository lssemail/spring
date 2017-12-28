package com.springaction.part01.concert;

import org.aspectj.lang.annotation.Aspect;

/**
 * Created by lssemail on 2017/12/28.
 */
@Aspect
public class EncoreableIntroducer {

//    @DeclareParents(value = "com.springaction.part01.concert.Performance+",
//        defaultImpl = EncoreableIntroducer.class)
    public static Encoreable encoreable;
}
