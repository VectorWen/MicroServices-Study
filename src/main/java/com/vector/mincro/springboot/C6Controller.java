package com.vector.mincro.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: vector.huang
 * date: 2017/08/23 15:18
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping("/mybatis")
public class C6Controller {

    @Autowired
    private C6MyBatisUserMapper mapper;

    @RequestMapping("/getUser")
    public Object getUser(){

        return mapper.findByName("黄廉温");

    }
}
