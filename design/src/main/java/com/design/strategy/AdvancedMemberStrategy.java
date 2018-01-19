package com.design.strategy;

/**
 * Created by lssemail on 2018/1/19.
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("高级会员折扣50%");
        return bookPrice * 0.5;
    }
}
