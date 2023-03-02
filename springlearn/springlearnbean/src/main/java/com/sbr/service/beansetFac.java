package com.sbr.service;

import com.sbr.pojo.Hello;
import com.sbr.pojo.User;
import com.sbr.pojo.UserS;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class beansetFac {
    @Test
    public  void test1() {
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id
        Hello hello = (Hello) context.getBean("hello");
        hello.setName("str");
        hello.show();

        UserS user = (UserS) context.getBean("userS");
//        user.setName("233");
        user.show();

        UserS user2 = (UserS) context.getBean("user2");
        UserS user3 = (UserS) context.getBean("userS");
        user.setName("12");
        user2.setName("23");
        user2.show();
        user.show();
        user3.show();
    }



}
