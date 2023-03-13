package com.sbr.chap4.invocationproxy.demo1;

import org.testng.annotations.Test;

import java.lang.reflect.Proxy;

public class Clinet {
    @Test
    public void test3() {

        Rent host = new Host();
        ProxyInvocationHandler handler = new ProxyInvocationHandler(host);
        Rent proxy = (Rent) Proxy.newProxyInstance(handler.getClass().getClassLoader(), host.getClass().getInterfaces(), handler);
        proxy.rent();

        fkhouse fkp = new Fkp();
        ProxyInvocationHandler fkphandler = new ProxyInvocationHandler(fkp);
        fkhouse fkpproxy = (fkhouse) Proxy.newProxyInstance(fkphandler.getClass().getClassLoader(), fkp.getClass().getInterfaces(), fkphandler);
        fkpproxy.shout();

    }
}
