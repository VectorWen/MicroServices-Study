package com.vector.mincro.springboot;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * author: vector.huang
 * date: 2017/08/23 13:40
 */
@ControllerAdvice
public class C5AdviceController {

    /*
     * 异常同意管理，SpringBoot 默认的异常处理界面为 /error，为了更友好的处理，需要添加自定义处理方式
     * 1. 修改状态码， /error默认的状态码为404，HttpServletResponse本身默认是200
     *      添加@ResponseBody 注解
     *      修改response 的状态
     * 2. 异常匹配方式属于：尽量精准
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object defaultHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        response.setStatus(500);
        return new C5Result(1,e.getMessage());
    }

    @ExceptionHandler(value = RuntimeException.class)
    public Object runtimeHandler(HttpServletRequest request, Exception e) {
        return e;
    }
}
