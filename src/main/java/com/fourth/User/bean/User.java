package com.fourth.User.bean;

/**
 * Created by a on 2017/8/13.
 */
public class User {
    private int id;//用户ID
    private String deng;//登录名
    private String password;//密码
    private String role;//身份
    private String username;//呢称
    private String head;//头像
    private String sign;//个性签名
    private String address;//常驻地


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeng() {
        return deng;
    }

    public void setDeng(String deng) {
        this.deng = deng;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
