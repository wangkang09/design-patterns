package com.wangkang.design_patterns.Adapter模式.双向适配模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:52 2019/6/5
 * @Modified By:
 */
public class ForeignPlayerImpl implements ForeignPlayer {

    private String name;

    public ForeignPlayerImpl(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(name + " attack！");
    }

    @Override
    public void defense() {
        System.out.println(name + " defense！");
    }
}
