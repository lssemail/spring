package com.design.template;

/**
 * Created by lssemail on 2018/1/19.
 */
public class QAWorker extends Worker{

    public QAWorker(String name){
        super(name);
    }

    @Override
    public void work() {
        System.out.println(super.name + "QA开始工作了!!!");
    }
}
