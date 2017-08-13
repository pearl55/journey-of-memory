package com.fourth.User.impl;


import com.fourth.User.bean.User;
import com.fourth.User.repository.UserMapper;
import com.fourth.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by a on 2017/8/13.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public User login(Map<String, Object> params) {
        return userMapper.login(params);
    }

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public int findUserByPassword(String password) {
        User userByPassword = userMapper.findUserByPassword(password);
        if(userByPassword!=null){
            return 1;
        }
        return 0;
    }

    @Override
    public void updateUser(User user1) {
        userMapper.updateUser(user1);
    }

    @Override
    public User getUser(String deng) {
        return userMapper.getUser(deng);
    }

    @Override
    public User getHome(String deng) {
        return userMapper.getHome(deng);
    }


}
