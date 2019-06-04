package com.wangkang.design_patterns.Adapter模式.类_对象模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:49 2019/6/4
 * @Modified By:
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋"+super.getName()+"进攻!");
    }

    @Override
    public void defense() {
        System.out.println("前锋"+super.getName()+"防守!");
    }
}
