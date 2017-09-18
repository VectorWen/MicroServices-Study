package com.vector.mincro.spring4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * author: vector.huang
 * date: 2017/09/06 10:07
 */
public class Cat implements InitializingBean,DisposableBean {


    public Cat() {
        System.out.println(2);
    }

    @Override
    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("initialzing...");
    }

    @Override
    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }
}
