package com.vector.mincro;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * author: vector.huang
 * date: 2017/09/19 09:28
 */
//@Component
public class MyListener implements ApplicationListener<User> {
    @Override
    public void onApplicationEvent(User event) {
        System.out.println("接受到了事件：" + event.getClass());
    }
}
