package com.vector.mincro.springboot;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * author: vector.huang
 * date: 2017/08/23 14:16
 */
@Mapper
public interface C6MyBatisUserMapper {

    /*
     * 使用@Mapper 注解直接进入了MyBatis MapperRegister 里面
     *
     * 很可怕，很烦，MyBatis 的初始化是怎么进行的呢？啥都不知道哦。
     * 一个注解就成功了，我得去弄清楚怎么回事
     *
     */

    @Select("SELECT * FROM USER WHERE nickName = #{nickName}")
    C6MyBatisUser findByName(@Param("nickName") String nickName);

}
