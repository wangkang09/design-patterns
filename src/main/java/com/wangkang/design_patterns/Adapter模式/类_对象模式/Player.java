package com.wangkang.design_patterns.Adapter模式.类_对象模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:54 2019/6/4
 * @Modified By:
 */
public abstract class Player {
    private String 名字;

    public Player(String 名字) {
        this.名字 = 名字;
    }

    public abstract void 进攻();
    public abstract void 防守();

    public String get名字() {
        return 名字;
    }

    public void set名字(String 名字) {
        this.名字 = 名字;
    }
}
