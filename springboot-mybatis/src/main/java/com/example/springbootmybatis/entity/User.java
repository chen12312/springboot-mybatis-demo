package com.example.springbootmybatis.entity;

import java.io.Serializable;
import java.util.List;

import com.example.springbootmybatis.mapper.UserMapper;

import org.apache.ibatis.annotations.Insert;


/**
 * @author Trickster
 */
public class User implements Serializable {
    private String account;
    private String displayName;
    private Integer id;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void insertone(String account,String displayName){
        this.account = account;
        this.displayName = displayName;
    }

}