package com.springaction.part01.myapp;

public class DevDataSource implements AbstractDataSource{

    @Override
    public void print() {
        System.out.printf(this.toString());
    }

    private String name;

    public DevDataSource(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DevDataSource{" +
                "name='" + name + '\'' +
                '}';
    }
}
