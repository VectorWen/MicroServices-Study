package com.vector.mincro.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * author: vector.huang
 * date: 2017/09/06 09:22
 */
public class App {

    public static void main(String[] args) {
        //Spring4 追求的是使用注解搞定一切
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                Config.class,EchoBeanPostProcessor.class,EchoBeanFactoryPostProcessor.class,
                EchoBeanDefinitionRegistryPostProcessor.class);

        MyBean bean = context.getBean(MyBean.class);
        System.out.println(bean);

        bean = (MyBean) context.getBean("createMyBean");
        System.out.println(bean);

        Runnable runnable = context.getBean(Runnable.class);
        System.out.println(runnable);
        runnable.run();
        runnable = context.getBean(Runnable.class);
        System.out.println(runnable);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean(Cat.class));
        context.removeBeanDefinition("createCat");

        context.close();
    }

}
