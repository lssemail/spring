package com.springaction.part01.knight.config;

import com.springaction.part01.knight.BraveKnight;
import com.springaction.part01.knight.Knight;
import com.springaction.part01.knight.Quest;
import com.springaction.part01.knight.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){

        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){

        return new SlayDragonQuest(System.out);
    }
}
