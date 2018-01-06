package com.springaction.part04.rmi.service;

import org.springframework.stereotype.Component;

/**
 * Created by lssemail on 2017/12/28.
 */
@Component
public class HelloServiceImpl implements HelloService{

    @Override
    public String helloworld(String name) {
        return "hello, " + name;
    }
}
