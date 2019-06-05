package com.wangkang.design_patterns.Adapter模式.类_对象模式;

import org.junit.Test;

/**
 * @Description: 外国教练如何指挥中国球员：把中国球员包装成外国球员
 * @Author: wangkang
 * @Date: Created in 11:22 2019/6/4
 * @Modified By:
 */
public class PlayerTest {

    @Test
    public void test() {
        Player player = new Center("姚明");
        ForeignPlayer foreignPlayer = new ForeignCenterAdapter(player);

        foreignPlayer.attack();
        foreignPlayer.defense();
    }
}