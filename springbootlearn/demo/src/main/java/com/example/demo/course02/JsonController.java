package com.example.demo.course02;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jsoncontroll")
public class JsonController {

    @RequestMapping("/getUser")
    public User getUser() {
        return new User(1L,"gou","wolf");
    }

    @RequestMapping("/getUserList")
    public List<User> getUserList() {
        List<User> list = new ArrayList<>();
        User user1 = new User(2L,"mao","miao");
        User user2 = new User(3L,"gou","wolf");
        list.add(user1);
        list.add(user2);

        return  list;
    }

    @RequestMapping("/map")
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(1L, "倪升武", "123456");
        map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", null);
        map.put("粉丝数量", 4153);
        return map;
    }
}
