package com.multhread.part01;

/**
 * Created by lssemail on 2018/1/25.
 */
public class MyThread03 extends Thread{

    public MyThread03(String name){

        this.setName(name);
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()="+ this.getName());
        System.out.println("MyThread03 --end");
        System.out.println("MyThread03 构造方法 isAlive:" + this.isAlive());

    }

    @Override
    public void run() {
        System.out.println("Run --begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()="+ this.getName());
        System.out.println("Run --end");
        System.out.println("MyThread03 run方法 isAlive:" + this.isAlive());
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("MAIN");
        MyThread03 myThread03 = new MyThread03("MyThread03");
        Thread thread = new Thread(myThread03);
        thread.setName("AA");
        thread.start();

        System.out.println("main方法 MyThread03 isAlive:" + myThread03.isAlive());
        System.out.println("main方法 isAlive:" + currentThread().isAlive());

    }
}
