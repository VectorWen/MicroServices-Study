package com.vector.mincro.spring4;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * author: vector.huang
 * date: 2017/09/06 09:25
 */
@Configuration
public class Config {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//默认是单例
    public MyBean createMyBean() {
        return new MyBean();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//面对FactoryBean，Scope 是无效的
    public RunnableFactoryBean createRunnableFactoryBean() {
        return new RunnableFactoryBean();
    }

    @Bean
    public CarFactory createCarFactory() {
        return new CarFactory();
    }

    @Bean
    public Car createCar(CarFactory factory) {
        return factory.create();
    }

    @Bean(initMethod = "afterPropertiesSet",destroyMethod = "destroy")
    public Cat createCat() {
        return new Cat();
    }
}
