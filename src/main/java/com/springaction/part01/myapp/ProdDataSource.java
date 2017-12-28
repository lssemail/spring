package com.springaction.part01.myapp;

public class ProdDataSource implements AbstractDataSource{

    @Override
    public void print() {
        System.out.printf(this.toString());
    }

    private String name;

    public ProdDataSource(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProdDataSource{" +
                "name='" + name + '\'' +
                '}';
    }
}
