package com.springaction.part01.myapp.config;

import com.springaction.part01.myapp.DevDataSource;
import com.springaction.part01.myapp.ProdDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {

    @Bean
    @Profile("dev")
    public DevDataSource devDataSource(){

        return new DevDataSource("dev");
    }

    @Bean
    @Profile("prod")
    public ProdDataSource prodDataSource(){

        return new ProdDataSource("prod");
    }
}
