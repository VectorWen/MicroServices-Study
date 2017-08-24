package com.vector.mincro.springboot2;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author: vector.huang
 * date: 2017/08/24 12:55
 */
@Component
public class C1Component {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {

        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

}
