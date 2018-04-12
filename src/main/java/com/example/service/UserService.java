package com.example.service;

import com.example.model.User;

/**
 * Created by qinmengmei on 2018/3/16.
 */
public interface UserService {

    User selectByPrimaryKey(Integer id);
}
