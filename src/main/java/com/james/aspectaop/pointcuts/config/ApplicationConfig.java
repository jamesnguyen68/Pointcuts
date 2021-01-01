package com.james.aspectaop.pointcuts.config;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.james.componentscanning.practice")
public class ApplicationConfig {

}
