package com.sbr.chap4.invocationproxy.demo2;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("gou");
    }

    @Override
    public void delete() {
        System.out.println("mao");
    }
}
