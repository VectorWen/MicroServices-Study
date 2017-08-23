package com.vector.mincro.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * author: vector.huang
 * date: 2017/08/23 08:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class C2AutoConfigHomeTest {

    @Autowired
    private C2AutoConfigHome home;

    @Test
    public void printProperty() {

        System.out.println(home.getName());

    }

}
