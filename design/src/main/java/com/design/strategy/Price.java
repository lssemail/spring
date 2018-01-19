package com.design.strategy;

/**
 * Created by lssemail on 2018/1/19.
 */
public class Price {

    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy){
        this.memberStrategy = memberStrategy;
    }

    public double quote(double bookPrice){

        return this.memberStrategy.calcPrice(bookPrice);
    }
}
