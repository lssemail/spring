package com.design.decorator;

/**
 * Created by lssemail on 2018/1/18.
 */
public abstract class Decorator implements Person{

    protected Person person;

    public void setPerson(Person person){

        this.person = person;
    }


    @Override
    public void eat() {
        person.eat();
    }
}
