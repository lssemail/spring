package com.springaction.part01.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by lssemail on 2017/12/9.
 */
@Configuration
@Import({CDPlayerConfig.class})
@ImportResource("classpath:compactDisc.xml")
public class SoundSystemConfig {


}
