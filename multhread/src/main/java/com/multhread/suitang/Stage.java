package com.multhread.suitang;

/**
 * Created by lssemail on 2018/1/25.
 */
public class Stage extends Thread {

    @Override
    public void run() {
        Army armyOfSui = new Army();
        Army armyOfRevolt = new Army();

        Thread threadSui = new Thread(armyOfSui, "隋军");
        Thread threadRevolt = new Thread(armyOfRevolt, "农民起义军");


        threadRevolt.start();
        threadSui.start();

        try {
            //舞台线程休眠
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("关键先生来了");
        Thread key = new KeyPerson();
        key.setName("程咬金");


        armyOfSui.keepRunning = false;
        armyOfRevolt.keepRunning = false;


        try {
            //舞台线程休眠
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        key.start();
        try {
            key.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("over game");

    }

    public static void main(String[] args) {

        new Stage().start();

    }

}
