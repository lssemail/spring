package com.design.template;

/**
 * Created by lssemail on 2018/1/19.
 */
public class Test {

    public static void main(String[] args) {
        Worker it = new ITWorker("it");
        it.workOneDay();
        Worker hr = new HRWorker("hr");
        hr.workOneDay();
    }
}
