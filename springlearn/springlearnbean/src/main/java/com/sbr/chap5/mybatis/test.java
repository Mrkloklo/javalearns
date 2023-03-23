package com.sbr.chap5.mybatis;

import com.sbr.chap5.mybatis.dao.UserDao;
import com.sbr.chap5.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {

    @Test
    public void selectUser() throws IOException {

        String resource = "chap5/mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> userList = mapper.selectUser();
        for (User user: userList){
            System.out.println(user.toString());
        }

        sqlSession.close();
    }
}
