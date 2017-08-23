package com.vector.mincro.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * author: vector.huang
 * date: 2017/08/23 09:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class C2AutoConfigUserTest {

    @Autowired
    private C2AutoConfigUser user;

    @Test
    public void printUser(){
        System.out.println(user.getName());
    }

}
