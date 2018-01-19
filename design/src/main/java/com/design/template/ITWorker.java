package com.design.template;

/**
 * Created by lssemail on 2018/1/19.
 */
public class ITWorker extends Worker{

    public ITWorker(String name){
        super(name);
    }

    @Override
    public void work() {
        System.out.println(super.name + "程序员开始工作了!!!");
    }

    @Override
    public boolean isNeedPrintDate() {

        return Boolean.TRUE;
    }
}
