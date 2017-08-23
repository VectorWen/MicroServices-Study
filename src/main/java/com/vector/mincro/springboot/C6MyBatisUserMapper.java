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
     */

    @Select("SELECT * FROM USER WHERE nickName = #{nickName}")
    C6MyBatisUser findByName(@Param("nickName") String nickName);

}
