package com.design.strategy;

/**
 * Created by lssemail on 2018/1/19.
 */
public class Test {

    public static void main(String[] args) {
        MemberStrategy strategy = new AdvancedMemberStrategy();
        Price price = new Price(strategy);
        System.out.println(price.quote(200D));
    }
}
