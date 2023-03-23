package com.sbr.chap4.aop.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class AopTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.search();
    }
}
