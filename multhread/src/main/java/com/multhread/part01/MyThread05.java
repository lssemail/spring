package com.multhread.part01;

import java.util.Currency;

/**
 * Created by lssemail on 2018/1/25.
 */
public class MyThread05 extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i=0; i< 50000; i++){
            System.out.println("i=" + (i + 1));
            if(this.isInterrupted()){
                break;
            }
        }

    }

    public static void main(String[] args) {
        MyThread05 myThread05 = new MyThread05();

        myThread05.start();
        try {
            Thread.sleep(1000);
            myThread05.interrupt();

            System.out.println("是否已经停止?=" + Thread.interrupted());
            System.out.println("是否已经停止?=" + Thread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!!!");
    }
}
