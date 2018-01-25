package com.multhread.part01;

/**
 * Created by lssemail on 2018/1/25.
 */
public class MyThread04 extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i=0; i< 50000; i++){
            System.out.println("i=" + (i + 1));
        }

    }

    public static void main(String[] args) {
        MyThread04 myThread04 = new MyThread04();

        myThread04.start();
        try {
            Thread.sleep(2000);
            myThread04.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
