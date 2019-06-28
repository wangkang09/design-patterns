package com.wangkang.design_patterns.Proxy模式.DynamicProxy;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 15:41 2019/6/28
 * @Modified By:
 */
public class GoHomeImpl implements GoHome {
    @Override
    public void goHome() {
        System.out.println("回家啦~");
    }
}
