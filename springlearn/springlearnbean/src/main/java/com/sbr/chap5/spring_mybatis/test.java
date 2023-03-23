package com.sbr.chap5.spring_mybatis;

import com.sbr.chap5.mybatis.dao.UserDao;
import com.sbr.chap5.mybatis.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

public class test {


    @Test
    public void tes2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("chap5/springmybatisConfig.xml");
        UserDao mapper = (UserDao) context.getBean("userDao");
        List<User> user = mapper.selectUser();
        System.out.println(user);
    }

}
