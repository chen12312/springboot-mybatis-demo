package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.service.UserService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll(Map<String,Object> params) {
        return userMapper.findAll(params);
    }

    @Override

    public User insertone (User User){
        return User;
    }

    @Override

    public int inserttwo (User account){
        account.getAccount();
        account.getDisplayName();
        return userMapper.inserttwo(account);
    }
}
