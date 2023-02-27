package com.sbr.service;

import com.sbr.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class myTest {

    @Test
    public void testMethodAutowire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("animals.xml");

        User user = (User) context.getBean("user");

        user.getCat().shout();
    }
}
