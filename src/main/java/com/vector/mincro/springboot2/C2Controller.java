package com.vector.mincro.springboot2;

import com.vector.mincro.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: vector.huang
 * date: 2017/08/28 14:23
 */
@RestController
@RequestMapping("/async")
public class C2Controller {

    @Autowired
    private C2AsyncComponent async;

    @RequestMapping("/task")
    public Object task() {

        async.taskOne();
        async.taskTwe();

        return new Result("成功了");
    }

}
