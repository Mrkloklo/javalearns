package com.sbr.chap5.mybatis.pojo;

public class User {

    private String username;   //姓名
    private String password;   //密码

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
