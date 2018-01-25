package com.multhread.part01;

/**
 * Created by lssemail on 2018/1/25.
 */
public class MyThread01 implements Runnable{

    private int count = 20;

    @Override
    synchronized public void run() {
        while (count > 0){
            System.out.println(Thread.currentThread().getName() + "此刻的计数是:\t" +count--);
            Thread.yield();
        }

    }

    public static void main(String[] args) {
        MyThread01 my = new MyThread01();
        Thread thread1 = new Thread(my, "A");
        Thread thread2 = new Thread(my, "B");
        Thread thread3 = new Thread(my, "C");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
