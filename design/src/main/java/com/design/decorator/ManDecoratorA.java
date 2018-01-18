package com.design.decorator;

/**
 * Created by lssemail on 2018/1/18.
 */
public class ManDecoratorA extends Decorator {

    @Override
    public void eat(){
        super.eat();
        reEat();
        System.out.println(ManDecoratorA.class.getSimpleName());
    }

    public void reEat(){
        System.out.println("再吃一顿饭");
    }
}
