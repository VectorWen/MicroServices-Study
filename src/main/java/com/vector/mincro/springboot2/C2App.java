package com.vector.mincro.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * author: vector.huang
 * date: 2017/08/28 14:18
 */
@SpringBootApplication
@EnableAsync
public class C2App {

    public static void main(String[] args) {
        SpringApplication.run(C2App.class,args);
    }

}
