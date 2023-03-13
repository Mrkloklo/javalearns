package com.sbr.chap4.invocationproxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInstanceHandler implements InvocationHandler {
    private Object obj;

    public ProxyInstanceHandler() {
    }

    public ProxyInstanceHandler(Object obj) {
        this.obj = obj;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), this.obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行了：" + this.obj.getClass().getName() + "类中" + method.getName() + "方法");
        return method.invoke(this.obj, args);
    }
}
