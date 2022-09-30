package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import com.example.springbootmybatis.mapper.UserMapper;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("query")
    public List<User> queryUsers() {
        Map<String,Object> params=new HashMap<>();
        params.put("Account","DisplayName");
        return userService.findAll(params);
    }
//    @GetMapping("i")
//    public User insertone() {
//        User user=new User();
//        user.insertone(inserttwo().getAccount(), inserttwo().getDisplayName());
//        return userService.insertone(user);
//    }


    @GetMapping("i")
    public int inserttwo() {
        User account=new User();
        User displayName=new User();
       // User user=new User();
        account.setAccount("1233");
        account.setDisplayName("倒反天罡");
      //  user.inserttwo(account.getAccount(), displayName.getDisplayName());
       // account.insertone(account.getAccount(), account.getDisplayName());
        return userService.inserttwo(account);
    }
//    public User insertone() {
//        User user=new User();
//        user.insertone(inserttwo().getAccount(), inserttwo().getDisplayName());
//        return userService.insertone(user);
//    }


}
