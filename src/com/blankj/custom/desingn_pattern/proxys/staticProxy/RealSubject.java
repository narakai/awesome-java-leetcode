package com.blankj.custom.desingn_pattern.proxys.staticProxy;

public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("我是真实对象");
    }
}
