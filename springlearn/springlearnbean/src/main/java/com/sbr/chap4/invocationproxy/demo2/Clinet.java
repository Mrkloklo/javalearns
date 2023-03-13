package com.sbr.chap4.invocationproxy.demo2;

import org.testng.annotations.Test;

public class Clinet {
    private UserService userService;

    @Test
    public void test(){
        userService = new UserServiceImpl();
        ProxyInstanceHandler handler = new ProxyInstanceHandler(userService);
        UserService proxy = (UserService) handler.getProxy();
        proxy.add();
        proxy.delete();
    }
}
