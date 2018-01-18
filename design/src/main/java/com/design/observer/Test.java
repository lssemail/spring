package com.design.observer;

/**
 * Created by lssemail on 2018/1/18.
 * https://www.jianshu.com/p/3459188bc8f9
 */
public class Test {

    public static void main(String[] args) {

        MagazineData magazineData = new MagazineData();

        Observer customerA = new Customer("A");
        Observer customerB = new Customer("B");
        Observer customerC = new Customer("C");

        magazineData.registerObserver(customerA);
        magazineData.registerObserver(customerB);
        magazineData.registerObserver(customerC);

        magazineData.setInfomation(5, 20);
    }
}
