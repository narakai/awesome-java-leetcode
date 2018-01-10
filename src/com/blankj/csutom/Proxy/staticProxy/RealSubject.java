package com.blankj.csutom.Proxy.staticProxy;

public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("我是真实对象");
    }
}
