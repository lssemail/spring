package com.design.factory.simple;

/**
 * Created by lssemail on 2018/1/13.
 * 简单工厂模式分离产品的创建者和消费者，有利于软件系统结构的优化；但是由于一切逻辑都集中在一个工厂类中，导致了没有很高的内聚性，同时也违背了“开放封闭原则”。
 * 另外，简单工厂模式的方法一般都是静态的，而静态工厂方法是无法让子类继承的，因此，简单工厂模式无法形成基于基类的继承树结构
 */
public class FoodFactory {

    public static Food getFood(String type){

        try {
            if("MC".equals(type.toUpperCase())){
                return McChicken.class.newInstance();
            }else if("CHIP".equals(type.toUpperCase())){
                return Chips.class.newInstance();
            }else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Food getFood(Class<? extends Food> foodClass){

        try {
            if(McChicken.class.equals(foodClass)){
                return McChicken.class.newInstance();
            }else if(Chips.class.equals(foodClass)){
                return Chips.class.newInstance();
            }else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
