package com.sbr.chap4.aop.demo3;

import com.sbr.chap4.aop.demo2.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class AopTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aoptest3.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.search();
    }
}
