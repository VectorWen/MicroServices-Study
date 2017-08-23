package com.vector.mincro.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * author: vector.huang
 * date: 2017/08/23 09:37
 */
@RestController
@RequestMapping("users")
public class C3RestController {

    private static Map<Integer,C3User> users = Collections.synchronizedMap(new HashMap<Integer, C3User>());

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<C3User> getUsers(){
        List<C3User> r = new ArrayList<C3User>(users.values());
        return r;
    }


    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Object postUser(@ModelAttribute C3User user){
        users.put(user.getId(),user);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Integer id, @ModelAttribute C3User user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        C3User u = users.get(id);
        u.setNickName(user.getNickName());
        u.setAvatar(user.getAvatar());
        users.put(id, u);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        users.remove(id);
        return "success";
    }

}
