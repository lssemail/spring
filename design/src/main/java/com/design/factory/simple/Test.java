package com.design.factory.simple;

/**
 * Created by lssemail on 2018/1/13.
 */
public class Test {

    public static void main(String[] args) {
        Food chip = FoodFactory.getFood("CHIP");
        chip.get();

        Food mc = FoodFactory.getFood(McChicken.class);
        mc.get();
    }
}
