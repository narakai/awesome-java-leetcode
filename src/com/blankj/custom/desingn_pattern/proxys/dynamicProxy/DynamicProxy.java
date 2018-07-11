package com.blankj.custom.desingn_pattern.proxys.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    @SuppressWarnings("unchecked")
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler) {
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
