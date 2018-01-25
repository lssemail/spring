package com.multhread.part01;

/**
 * Created by lssemail on 2018/1/25.
 * println() 与 i++ 联合使用有可能出现另外一种异常情况
 */
public class Mythread02 extends Thread{

    private int i = 5;
    @Override
    public void run() {
        super.run();
        System.out.println("i=" + (i--) + "thradName=" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Mythread02 mythread02 = new Mythread02();
        Thread t1 = new Thread(mythread02);
        Thread t2 = new Thread(mythread02);
        Thread t3 = new Thread(mythread02);
        Thread t4 = new Thread(mythread02);
        Thread t5 = new Thread(mythread02);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
