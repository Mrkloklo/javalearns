package com.sbr.pojo;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public User() {
        System.out.println("user无参构造方法");
    }

    public User(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name+"user");
    }
}
