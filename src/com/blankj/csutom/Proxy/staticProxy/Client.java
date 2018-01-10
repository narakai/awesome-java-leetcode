package com.blankj.csutom.Proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
