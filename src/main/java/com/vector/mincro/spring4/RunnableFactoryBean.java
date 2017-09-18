package com.vector.mincro.spring4;

import org.springframework.beans.factory.FactoryBean;

/**
 * author: vector.huang
 * date: 2017/09/06 09:38
 */
public class RunnableFactoryBean implements FactoryBean<Runnable> {

    @Override
    public Runnable getObject() throws Exception {
        return ()-> System.out.println("FactoryBean");
    }

    @Override
    public Class<?> getObjectType() {
        return Runnable.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
