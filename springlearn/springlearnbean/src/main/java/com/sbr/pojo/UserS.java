package com.sbr.pojo;

public class UserS {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public UserS() {
        System.out.println("user无参构造方法");
    }

    public UserS(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name+"user");
    }
}
