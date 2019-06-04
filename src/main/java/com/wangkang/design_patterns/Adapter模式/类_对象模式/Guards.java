package com.wangkang.design_patterns.Adapter模式.类_对象模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:51 2019/6/4
 * @Modified By:
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫"+super.getName()+"进攻!");
    }

    @Override
    public void defense() {
        System.out.println("后卫"+super.getName()+"进攻!");
    }
}
