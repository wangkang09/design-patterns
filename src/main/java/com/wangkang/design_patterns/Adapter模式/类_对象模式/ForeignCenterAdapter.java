package com.wangkang.design_patterns.Adapter模式.类_对象模式;

/**
 * @Description: 这个适配器用来伪装成客户需要的类的形式
 * @Author: wangkang
 * @Date: Created in 11:01 2019/6/4
 * @Modified By:
 */
public class ForeignCenterAdapter extends ForeignPlayer {
    private Player player;
    public ForeignCenterAdapter(Player player) {
        super(player.get名字());
        this.player = player;
    }

    @Override
    public void attack() {
        player.进攻();
    }

    @Override
    public void defense() {
        player.防守();
    }
}
