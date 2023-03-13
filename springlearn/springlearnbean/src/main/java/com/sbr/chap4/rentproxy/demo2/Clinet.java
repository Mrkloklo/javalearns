package com.sbr.chap4.rentproxy.demo2;

public class Clinet {
    public static void main(String[] args) {
        UserServiceImpl userSerivce = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userSerivce);
        proxy.add();
    }
}
