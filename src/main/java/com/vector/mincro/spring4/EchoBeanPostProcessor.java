package com.vector.mincro.spring4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * author: vector.huang
 * date: 2017/09/18 08:55
 */
@Component
public class EchoBeanPostProcessor implements BeanPostProcessor{


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=====postProcessBeforeInitialization===="+bean.getClass());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=====postProcessAfterInitialization===="+bean.getClass());
        return bean;
    }
}
