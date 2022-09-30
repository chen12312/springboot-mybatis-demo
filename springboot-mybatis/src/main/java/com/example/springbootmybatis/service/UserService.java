package com.example.springbootmybatis.service;
import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.mapper.UserMapper;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

public interface UserService {

     List<User> findAll(Map<String,Object> params) ;

     User insertone(User user);

     int inserttwo(User account);

}
