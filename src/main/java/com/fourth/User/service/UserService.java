package com.fourth.User.service;

import com.fourth.User.bean.User;

import java.util.Map;

/**
 * Created by a on 2017/8/13.
 */
public interface UserService {
    /**
     *
     * 注册
     */
    public void add(User user);
    /**
     * 登录
     */
    public User login(Map<String, Object> params);
    /**
     根据ID修改回显
     */
    User findUserById(int id);
    /**
     验证修改时原密码是否一样
     */
    int findUserByPassword(String password);
    /**
     修改个人资料
     */
    void updateUser(User user1);
    /**
     * 根据用户名获取用户全部信息
     */
    public User getUser(String deng);
    /**
     * 根据谁登录返回首页
     */
    public User getHome(String deng);

}
