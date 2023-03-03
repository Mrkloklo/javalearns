package com.sbr.chap3.service;

import com.sbr.chap3.config.MyConfig;
import com.sbr.chap3.pojo.Cat;
import com.sbr.chap3.pojo.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

public class configtest {
    @Test
    public void test() {
        ApplicationContext content = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog) content.getBean("dog");
        Cat cat = (Cat) content.getBean("cat");
        System.out.println(dog.name);
        System.out.println(cat.name);
    }
}
