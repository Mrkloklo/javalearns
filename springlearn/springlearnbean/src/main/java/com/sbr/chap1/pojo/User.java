package com.sbr.chap1.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class User {

//    @Autowired
//    @Autowired是按类型自动转配的，不支持id匹配。
//    需要导入 spring-aop的包！
//    如果允许对象为null，设置required = false,默认为true
//    @Qualifier
//    @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
//    @Qualifier不能单独使用。
//    它们的作用相同都是用注解方式注入对象，但执行顺序不同。@Autowired先byType，@Resource先byName。
    @Autowired(required = false)
    @Qualifier(value = "cat1")
    private Cat cat;
    @Resource(name = "dog1")
    private Dog dog;
    private String str;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
