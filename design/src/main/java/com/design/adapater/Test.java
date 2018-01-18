package com.design.adapater;

/**
 * Created by lssemail on 2018/1/13.
 */
public class Test {

    public static void main(String[] args) {
        MacUSB macUSB = new MacUSB();
        LenovoAdapter lenovoAdapter = new LenovoAdapter(macUSB);
        Lenovo lenovo = new Lenovo(lenovoAdapter.getLenovoUSB());
    }
}
