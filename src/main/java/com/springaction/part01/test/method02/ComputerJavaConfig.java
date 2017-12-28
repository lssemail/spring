package com.springaction.part01.test.method02;

import com.springaction.part01.test.LenvoComputer;
import com.springaction.part01.test.MiComputer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerJavaConfig {

    @Bean
    public LenvoComputer lenvoComputer(){

        return new LenvoComputer();
    }

    @Bean
    public MiComputer miComputer(){

        return new MiComputer(lenvoComputer());
    }


}
