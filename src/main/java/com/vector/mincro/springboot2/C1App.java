package com.vector.mincro.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * author: vector.huang
 * date: 2017/08/24 12:54
 */
@SpringBootApplication
@EnableScheduling
public class C1App {

    public static void main(String[] args) {
        SpringApplication.run(C1App.class, args);
    }

}
