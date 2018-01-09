package spittr.transaction;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by lssemail on 2018/1/9.
 */
@Aspect
public class TransactionAspect {

    @Before("execution(* spittr.transaction.AccountService.transfer(..))")
    public void beginTransaction(){
        System.out.println("beginTransaction");
    }

    @After("execution(* spittr.transaction.AccountService.transfer(..))")
    public void endTransaction(){
        System.out.println("endTransaction");
    }

}
