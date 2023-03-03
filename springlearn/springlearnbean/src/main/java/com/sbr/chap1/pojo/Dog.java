package com.sbr.chap1.pojo;

public class Dog {
    public Dog() {

    }

    public String getJiao() {
        return jiao;
    }

    public void setJiao(String jiao) {
        this.jiao = jiao;
    }

    private String jiao;

    public Dog(String jiao) {
        this.jiao = jiao;
    }

    public void shout() {
        System.out.print(jiao);
    }
}
