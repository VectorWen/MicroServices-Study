package com.vector.mincro.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: vector.huang
 * date: 2017/08/22 14:18
 */
@RestController
public class C1HelloController {

    /**
     * produces 可以控制返回数据的类型Content-Type
     */
    @RequestMapping(value = {"/hello2"}, produces = "applicaton/json;charset=UTF-8")
    public String index2() {
        return "{\"say\":\"Hello SpringBoot!!\"}";
    }

    /**
     * method 控制请求的方式，和SpringMVC 一样
     * 已经使用了@RestController 就不需要@ResponseBody了
     */
    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String index() {
        return "Hello SpringBoot!!";
    }

}
