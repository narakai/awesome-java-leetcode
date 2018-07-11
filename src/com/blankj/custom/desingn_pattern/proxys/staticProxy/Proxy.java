package com.blankj.custom.desingn_pattern.proxys.staticProxy;

public class Proxy implements ISubject {
    private ISubject subject;

    //传入接口的实现类
    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.subject.request();
    }
}
