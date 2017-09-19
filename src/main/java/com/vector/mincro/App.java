package com.vector.mincro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * author: vector.huang
 * date: 2017/08/24 12:53
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext content = SpringApplication.run(App.class, args);

        User user = content.getBean(User.class);
        System.out.println(user.getClass());

        content.close();
    }
}
