package com.vector.mincro;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * author: vector.huang
 * date: 2017/09/19 09:20
 */
public class User extends ApplicationEvent {

    public User(Object source) {
        super(source);
    }
}
