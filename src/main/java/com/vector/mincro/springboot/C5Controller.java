package com.vector.mincro.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: vector.huang
 * date: 2017/08/23 13:43
 */
@RestController
@RequestMapping("/advice")
public class C5Controller {

    @RequestMapping(value = "/getAdvice")
    public Object getAdvice() throws Exception {
        throw new Exception("笨蛋");
    }

    @RequestMapping(value = "/getAdvice2")
    public Object getAdvice2() throws Exception {
        throw new RuntimeException("笨蛋");
    }

}
