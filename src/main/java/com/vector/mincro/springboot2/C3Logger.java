package com.vector.mincro.springboot2;

import com.vector.mincro.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: vector.huang
 * date: 2017/08/28 14:39
 */
@RestController
@RequestMapping("/logger")
public class C3Logger {

    /*
        SpringBoot 使用的是CommonsLogging（slf4j） 通用日志接口，具体实现会被动态查找
     */

    /* 2016-04-13 08:23:50.120  INFO 37397 --- [main]org.hibernate.Version: HHH000412: Hibernate Core {4.3.11.Final}
     * 时间日期 — 精确到毫秒
       日志级别 — ERROR, WARN, INFO, DEBUG or TRACE
       进程ID
       分隔符 — --- 标识实际日志的开始
       线程名 — 方括号括起来（可能会截断控制台输出）
       Logger名 — 通常使用源代码的类名
       日志内容
     */

    @RequestMapping("/impl")
    public Object impl() {

        //这里可以获取一个实现
        //org.apache.commons.logging.impl.SLF4JLocationAwareLog -- 默认实现，不含其它实现的时候
        Logger log = LoggerFactory.getLogger(C3Logger.class);
        log.debug("我是测试logger 的 ：" + log.getClass().getSimpleName());

        return new Result(log.getClass().getSimpleName() + " : " + log.getClass().getName());
    }
}
