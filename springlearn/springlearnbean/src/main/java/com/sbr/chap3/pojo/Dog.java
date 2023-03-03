package com.sbr.chap3.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    @Value("gou")
    public void setName(String name) {
        this.name = name;
    }

    public String name;
}
