package com.springaction.part04.rmi.demo;

import java.io.Serializable;

/**
 * Created by lssemail on 2017/12/28.
 */
public class PersonEntity implements Serializable{

    private int id;

    private String name;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
