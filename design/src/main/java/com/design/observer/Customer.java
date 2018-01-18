package com.design.observer;

/**
 * Created by lssemail on 2018/1/18.
 */
public class Customer implements Observer{

    private String name;
    private int edition;
    private float cost;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void update(int edition, float cost) {

        this.edition = edition;
        this.cost = cost;
        buy();
    }

    public void buy(){
        System.out.println(name+"购买了第"+edition+"期的杂志，花费了"+cost+"元。");
    }
}
