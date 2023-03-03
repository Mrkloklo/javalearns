package com.sbr.chap3.config;

import com.sbr.chap3.pojo.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig2 {

    @Bean
    public Cat cat() {
        return new Cat();
    }
}
