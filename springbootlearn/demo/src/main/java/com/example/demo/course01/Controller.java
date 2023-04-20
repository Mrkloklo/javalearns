package com.example.demo.course01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class Controller {
    @RequestMapping("/springboot")
    public String StartSpringBoot() {
        return "welcom use springboot";
    }
}
