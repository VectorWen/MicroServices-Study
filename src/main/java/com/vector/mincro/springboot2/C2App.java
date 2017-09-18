package com.vector.mincro.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * author: vector.huang
 * date: 2017/08/28 14:18
 */
@SpringBootApplication
@EnableAsync
public class C2App {

    @Bean
    public Runnable createRunnable(){
        return ()-> System.out.println("init");
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(C2App.class,args);
        context.getBean(Runnable.class).run();
    }

}
