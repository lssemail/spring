package com.design.strategy;

/**
 * Created by lssemail on 2018/1/19.
 *
 */
public class PrimaryMemberStrategy implements MemberStrategy{

    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("初级会员没有折扣");
        return bookPrice;
    }
}
