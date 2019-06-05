package com.wangkang.design_patterns.Adapter模式.双向适配模式;


import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:55 2019/6/5
 * @Modified By:
 */
public class TwoWayPalyerAdapterTest {

    @Test
    public void test() {
        //中国教练指挥外国球员
        Player player = new TwoFacePalyerAdapter(new ForeignPlayerImpl("Jordan"));
        player.防守();
        player.进攻();
        //外国教练指挥中国球员
        ForeignPlayer fPlayer = new TwoFacePalyerAdapter(new PlayerImpl("姚明"));
        fPlayer.attack();
        fPlayer.defense();
    }

}