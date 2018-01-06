package com.springaction.part04.rmi.service;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * Created by lssemail on 2017/12/28.
 */
@Configuration
@ComponentScan
public class RMIConfig {

    @Bean
    public RmiServiceExporter rmiServiceExporter(HelloService helloService){

        RmiServiceExporter rmiExporter = new RmiServiceExporter();
        rmiExporter.setService(helloService);
        rmiExporter.setServiceName("HelloService");
        rmiExporter.setServiceInterface(HelloService.class);

//        rmiExporter.setRegistryHost("");
//        rmiExporter.setRegistryPort(1199);
        return rmiExporter;

    }

}
