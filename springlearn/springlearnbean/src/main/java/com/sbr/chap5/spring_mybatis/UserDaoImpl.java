package com.sbr.chap5.spring_mybatis;

import com.sbr.chap5.mybatis.dao.UserDao;
import com.sbr.chap5.mybatis.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserDao userdao = sqlSession.getMapper(UserDao.class);
        System.out.println("走了mybatis-spring");
        return  userdao.selectUser();
    }
}
