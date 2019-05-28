package com.wangkang.design_patterns.创建型模式集合;

import com.wangkang.design_patterns.创建型模式集合.抽象工厂.ConditionChain;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 13:12 2019/5/27
 * @Modified By:
 */
public abstract class MapSite {
    abstract void Enter();

    //返回一个 Enter() 方法进入的条件链
    protected ConditionChain conditionChain() {
        return new ConditionChain();
    }
}
