package com.james.aspectaop.pointcuts;

import com.james.aspectaop.pointcuts.config.ApplicationConfig;
import com.james.aspectaop.pointcuts.service.OutputService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointcutsApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);
        for (int i=0;i<5;i++){
            outputService.generateOutput();
            Thread.sleep(3000);
        }
    }
}

