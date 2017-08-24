package com.vector.mincro.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: vector.huang
 * date: 2017/08/24 11:28
 */
@RestController
@RequestMapping("/transaction")
public class C8Controller {

    @Autowired
    private C8UserService userService;

    @RequestMapping(value = {"/getUser"}, method = {RequestMethod.GET, RequestMethod.POST},
            produces = "application/json;charset=UTF-8")
    public Object getUser() {

        return userService.getUser();

    }

}
