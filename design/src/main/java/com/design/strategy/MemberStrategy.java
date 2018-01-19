package com.design.strategy;

/**
 * Created by lssemail on 2018/1/19.
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     * @param bookPrice 图书的原价
     * @return 打折后的价格
     */
    public double calcPrice(double bookPrice);
}
