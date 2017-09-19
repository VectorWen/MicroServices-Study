package com.vector.mincro;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * author: vector.huang
 * date: 2017/09/19 09:41
 */
@Component
public class MyAnnotationListener {

    /**
     * 参数必须一个，类型任意
     */
    @EventListener
    public void event(Object event) {
        System.out.println("MyAnnotationListener 接受到了事件：" + event.getClass());
    }

}
