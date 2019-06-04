package com.wangkang.design_patterns.Adapter模式.类_对象模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:50 2019/6/4
 * @Modified By:
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }
    @Override
    public void attack() {
        System.out.println("中锋"+super.getName()+"进攻!");
    }
    @Override
    public void defense() {
        System.out.println("中锋"+super.getName()+"进攻!");
    }
}
