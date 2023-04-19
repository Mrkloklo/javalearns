package com.sbr.chap6.dao;

import com.sbr.chap6.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

    public UserDao getMapper() {
        return getSqlSession().getMapper(UserDao.class);
    }

    @Override
    public List<User> selUsers() {
        return getMapper().selUsers();
    }

    @Override
    public int deleteUser(String username) {
        return getMapper().deleteUser(username);
    }

    @Override
    public int addUsers(User user) {
        return  getMapper().addUsers(user);
    }

    public void test(User user) {
        addUsers(user);
        deleteUser(user.getUsername());
    }
}
