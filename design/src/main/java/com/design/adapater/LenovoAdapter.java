package com.design.adapater;

/**
 * Created by lssemail on 2018/1/13.
 */
public class LenovoAdapter {

    private MacUSB macUSB;

    public LenovoAdapter(MacUSB macUSB){
        this.macUSB = macUSB;
    }

    public LenovoUSB getLenovoUSB(){

        System.out.println("macUSB ----> lenovoUSB");
        return new LenovoUSB();
    }

}
