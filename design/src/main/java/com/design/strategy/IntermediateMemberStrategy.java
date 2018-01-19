package com.design.strategy;

/**
 * Created by lssemail on 2018/1/19.
 */
public class IntermediateMemberStrategy implements MemberStrategy{

    @Override
    public double calcPrice(double bookPrice) {

        System.out.println("中级会员折扣20%");
        return bookPrice * 0.8;
    }
}
