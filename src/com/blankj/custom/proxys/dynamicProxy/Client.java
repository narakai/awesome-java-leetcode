package com.blankj.custom.proxys.dynamicProxy;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();

        InvocationHandler handler = new MyInvocationHandler(subject);
        ISubject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.request();
    }
}