package com.sbr.chap6.dao;

import com.sbr.chap6.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
    @Override
    public List<User> selUsers() {
        UserDao mapper = getSqlSession().getMapper(UserDao.class);
        return mapper.selUsers();
    }
}
