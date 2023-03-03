package com.sbr.chap2.service;

import com.sbr.chap2.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class DemoService {

    @Test
    public void test() {
        ApplicationContext content = new ClassPathXmlApplicationContext("scanxml.xml");
        User user =(User) content.getBean("user");

        System.out.println(user.name);
    }
}
