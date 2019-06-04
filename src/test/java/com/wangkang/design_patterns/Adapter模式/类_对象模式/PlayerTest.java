package com.wangkang.design_patterns.Adapter模式.类_对象模式;

import org.junit.Test;

/**
 * @Description: 教练如何指挥外国球员
 * @Author: wangkang
 * @Date: Created in 11:22 2019/6/4
 * @Modified By:
 */
public class PlayerTest {

    @Test
    public void test() {
        ForeignPlayer foreignPlayer = new ForeignCenter("姚明");
        Player player = new ForeignCenterAdapter(foreignPlayer);

        player.attack();
        player.defense();
    }
}