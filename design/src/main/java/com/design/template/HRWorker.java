package com.design.template;

/**
 * Created by lssemail on 2018/1/19.
 */
public class HRWorker extends Worker{

    public HRWorker(String name){
        super(name);
    }

    @Override
    public void work() {
        System.out.println(super.name + "HR开始工作了!!!");
    }
}
