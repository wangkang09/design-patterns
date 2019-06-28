package com.wangkang.design_patterns.Proxy模式.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 15:42 2019/6/28
 * @Modified By:
 */
public class GoHomeInvocationHandler implements InvocationHandler {
    private Object obj;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 这里可以做增强
        System.out.println("先打电话回家~");
        Object result = method.invoke(obj, args);
        return result;
    }

    public GoHomeInvocationHandler(Object obj) {
        this.obj = obj;
    }

    public Object CreatProxyedObj() {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }
}
