package com.wangkang.design_patterns.Adapter模式.双向适配模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:51 2019/6/5
 * @Modified By:
 */
public class PlayerImpl implements Player {

    private String name;

    public PlayerImpl(String name) {
        this.name = name;
    }

    @Override
    public void 进攻() {
        System.out.println(name + " 进攻！");
    }

    @Override
    public void 防守() {
        System.out.println(name + " 防守！");
    }
}
