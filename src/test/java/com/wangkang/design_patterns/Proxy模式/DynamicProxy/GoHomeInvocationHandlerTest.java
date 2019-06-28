package com.wangkang.design_patterns.Proxy模式.DynamicProxy;


import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 15:55 2019/6/28
 * @Modified By:
 */
public class GoHomeInvocationHandlerTest {

    @Test
    public void test() {
        GoHomeInvocationHandler proxy = new GoHomeInvocationHandler(new GoHomeImpl());
        GoHome goHome = (GoHome)proxy.CreatProxyedObj();
        goHome.goHome();
    }

}