package com.example.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MInvocationHandler implements InvocationHandler {

    private Object target;

    public MInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("After method " + method.getName());
        return result;
    }
}