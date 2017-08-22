package com.vector.mincro.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: vector.huang
 * date: 2017/08/22 14:18
 */
@RestController
public class C1HelloController {

    @RequestMapping(value = {"/hello2"}, produces = "applicaton/json;charset=UTF-8")
    public String index2() {
        return "{\"say\":\"Hello SpringBoot!!\"}";
    }

    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String index() {
        return "Hello SpringBoot!!";
    }

}
