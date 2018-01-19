package com.design.template;

import java.util.Date;

/**
 * Created by lssemail on 2018/1/19.
 */
public abstract class Worker {

    protected String name;

    public Worker(String name){
        this.name = name;
    }

    public final void workOneDay(){
        System.out.println("=======work start========");
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
        System.out.println("=======work end==========");
    }

    public abstract void work();

    private void computerOff(){
        System.out.println(name + "关闭电脑");
    }

    private void computerOn(){
        System.out.println(name + "打开电脑");
    }

    private void enterCompany(){
        System.out.println(name + "进入公司");
    }

    private void exitCompany(){
        if(isNeedPrintDate()){
            System.out.println(new Date().toLocaleString());
        }
        System.out.println(name + "离开公司");
    }

    /**
     * 定义钩子方法
     * @return
     */
    public boolean isNeedPrintDate(){
        return Boolean.FALSE;
    }
}
