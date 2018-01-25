package com.multhread.suitang;

/**
 * Created by lssemail on 2018/1/25.
 */
public class KeyPerson extends Thread {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println(name + "开始了战斗");
        for (int i=0; i<5; i++){
            System.out.println(name + "攻击了" + i + "次， 杀杀杀！！！");
            Thread.yield();
        }
        System.out.println(name + "结束了战斗");
    }
}
