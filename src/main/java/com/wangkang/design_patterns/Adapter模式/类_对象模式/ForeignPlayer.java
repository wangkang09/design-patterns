package com.wangkang.design_patterns.Adapter模式.类_对象模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:48 2019/6/4
 * @Modified By:
 */
public abstract class ForeignPlayer {
    private String name;
    public ForeignPlayer(String name) {
        this.name = name;
    }
    public abstract void attack();
    public abstract void defense();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
