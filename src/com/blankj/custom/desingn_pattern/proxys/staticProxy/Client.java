package com.blankj.custom.desingn_pattern.proxys.staticProxy;

public class Client {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        //让RealSubject这个借口的实现类来完成任务
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
