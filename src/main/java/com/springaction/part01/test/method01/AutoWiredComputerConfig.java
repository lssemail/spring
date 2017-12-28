package com.springaction.part01.test.method01;

import com.springaction.part01.test.Part01ComponentConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"com.springaction.part01.test"})
@ComponentScan(basePackageClasses = Part01ComponentConfig.class)
public class AutoWiredComputerConfig {


}
