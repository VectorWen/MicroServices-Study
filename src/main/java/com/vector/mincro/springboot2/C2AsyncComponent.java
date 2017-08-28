package com.vector.mincro.springboot2;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * author: vector.huang
 * date: 2017/08/28 14:20
 */
@Component
public class C2AsyncComponent {

    @Async
    public void taskOne() {

        System.out.println("任务一开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("任务一结束");
    }


    @Async
    public void taskTwe() {

        System.out.println("任务二开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("任务二结束");
    }

}
