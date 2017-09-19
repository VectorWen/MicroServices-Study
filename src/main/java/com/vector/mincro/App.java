package com.vector.mincro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListenerMethodProcessor;

/**
 * author: vector.huang
 * date: 2017/08/24 12:53
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
//        context.addApplicationListener(new MyListener());
        context.publishEvent(new User(new Object()));

        context.close();
    }
}
