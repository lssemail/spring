package com.design.decorator;

/**
 * Created by lssemail on 2018/1/18.
 */
public class Test {

    public static void main(String[] args) {

        Man man = new Man();
        ManDecoratorA a = new ManDecoratorA();
        ManDecoratorB b = new ManDecoratorB();
        a.setPerson(man);
        b.setPerson(man);

        a.eat();
        b.eat();

    }
}
