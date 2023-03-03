package com.sbr.chap1.service;

import com.sbr.chap1.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class myTest {

    @Test
    public void testMethodAutowire() {

        ApplicationContext autowiredcontext = new ClassPathXmlApplicationContext("autowiredlearn.xml");
        User user = (User) autowiredcontext.getBean("user");
        user.getDog().shout();

    }
}
