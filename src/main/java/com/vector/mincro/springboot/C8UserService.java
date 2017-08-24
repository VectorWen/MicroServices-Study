package com.vector.mincro.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * author: vector.huang
 * date: 2017/08/24 11:26
 */
@Service
public class C8UserService {

    @Autowired
    private C6MyBatisUserMapper userMapper;

    @Transactional
    public C6MyBatisUser getUser(){
        return userMapper.findByName("黄廉温");
    }


}
