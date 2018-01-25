package com.multhread.suitang;

/**
 * Created by lssemail on 2018/1/25.
 */
public class Army implements Runnable{

    /**
     * volatile 保证了线程可以正确的读取其他线程写入的值;
     * 可见性 jvm happens-before原则
     */
    volatile boolean keepRunning = true;

    @Override
    public void run() {
        while (keepRunning){
            for (int i=0; i<5; i++){
                System.out.println(Thread.currentThread().getName() + "攻击了" + i + "次");
                Thread.yield();
            }
        }

        System.out.println(Thread.currentThread().getName()+"结束了战斗！");
    }
}
