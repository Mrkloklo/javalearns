package com.sbr.chap4.rentproxy.demo1;

public class Proxy implements Rent{
    private Hosts host;
    public Proxy() {}
    public Proxy(Hosts host) {
        this.host = host;
    }

    //租房
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }

    public void seeHouse() {
        System.out.println("带房客看房");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
