package com.blankj.custom.desingn_pattern.proxys.dynamicProxy;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {

//        一个典型的动态代理创建对象过程可分为以下四个步骤：
//        1、通过实现InvocationHandler接口创建自己的调用处理器 IvocationHandler handler = new InvocationHandlerImpl(...);
//        2、通过为Proxy类指定ClassLoader对象和一组interface创建动态代理类
//        Class clazz = Proxy.getProxyClass(classLoader,new Class[]{...});
//        3、通过反射机制获取动态代理类的构造函数，其参数类型是调用处理器接口类型
//        Constructor constructor = clazz.getConstructor(new Class[]{InvocationHandler.class});
//        4、通过构造函数创建代理类实例，此时需将调用处理器对象作为参数被传入
//        Interface Proxy = (Interface)constructor.newInstance(new Object[] (handler));

        ISubject subject = new RealSubject();

        InvocationHandler handler = new MyInvocationHandler(subject);
        ISubject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.request();
    }
}
