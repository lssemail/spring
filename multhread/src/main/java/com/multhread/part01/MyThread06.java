package com.multhread.part01;

/**
 * Created by lssemail on 2018/1/25.
 */
public class MyThread06 {

    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否已经停止?=" + Thread.interrupted());
        System.out.println("是否已经停止?=" + Thread.interrupted());
        System.out.println("end");
    }
}
