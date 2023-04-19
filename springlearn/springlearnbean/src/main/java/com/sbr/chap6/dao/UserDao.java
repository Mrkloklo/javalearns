package com.sbr.chap6.dao;

import com.sbr.chap6.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> selUsers();
    int addUsers(User user);
    //根据id删除用户
    int deleteUser(String username);

    void test(User user);
}
