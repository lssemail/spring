package com.multhread.suitang;

/**
 * Created by lssemail on 2018/1/25.
 */
public class Actor extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + "是一个演员!");
        int count = 0;
        boolean keepRunning = Boolean.TRUE;
        while (keepRunning){
            if(count == 100){
                break;
            }
            if(count % 10 == 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(getName() + "登台演出" + (++count));
        }
        System.out.println(getName() + "演出结束了!");
    }
}
