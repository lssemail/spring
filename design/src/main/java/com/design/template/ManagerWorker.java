package com.design.template;

/**
 * Created by lssemail on 2018/1/19.
 */
public class ManagerWorker extends Worker{

    public ManagerWorker(String name){
        super(name);
    }

    @Override
    public void work() {
        System.out.println(super.name + "Manager开始工作了!!!");
    }
}
