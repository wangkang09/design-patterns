package com.wangkang.design_patterns.Adapter模式.类_对象模式;

/**
 * @Description: 这个适配器用来伪装成客户需要的类的形式
 * @Author: wangkang
 * @Date: Created in 11:01 2019/6/4
 * @Modified By:
 */
public class ForeignCenterAdapter extends Player {
    private ForeignPlayer foreignPlayer;
    public ForeignCenterAdapter(ForeignPlayer foreignPlayer) {
        super(foreignPlayer.get名字());
        this.foreignPlayer = foreignPlayer;
    }

    @Override
    public void attack() {
        foreignPlayer.进攻();
    }

    @Override
    public void defense() {
        foreignPlayer.防守();
    }
}
