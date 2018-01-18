package com.design.decorator;

/**
 * Created by lssemail on 2018/1/18.
 */
public class ManDecoratorB extends Decorator {

    @Override
    public void eat(){
        super.eat();
        System.out.println("==========");
        System.out.println(ManDecoratorB.class.getSimpleName());
    }

}
