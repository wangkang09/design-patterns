package com.wangkang.design_patterns.Adapter模式.双向适配模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 12:07 2019/6/4
 * @Modified By:
 */
public class TwoFacePalyerAdapter implements Player,ForeignPlayer {
    Player player;
    ForeignPlayer foreignPlayer;

    public TwoFacePalyerAdapter(Player player) {
        this.player = player;
    }

    public TwoFacePalyerAdapter(ForeignPlayer foreignPlayer) {
        this.foreignPlayer = foreignPlayer;
    }

    @Override
    public void 进攻() {
        foreignPlayer.attack();
    }

    @Override
    public void 防守() {
        foreignPlayer.defense();
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
