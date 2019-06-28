package com.wangkang.design_patterns.Proxy模式.VirtualProxy;


import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 11:02 2019/6/28
 * @Modified By:
 */
public class BossTest {

    @Test
    public void test() throws InterruptedException {
        // 有很多人来找老板, 老板在忙, 助手先把所有事情安置好
        Assistant assistant = new Assistant();
        assistant.addOrder("我找Boss面试");
        assistant.addOrder("我找Boss借钱");
        assistant.addOrder("我找Boss聊天");

        // 收集好了, 助手的职责就完成了, 把Boss叫出来, 让Boss处理. 或者说approve这件事,助手是做不了的, 只能叫出Boss来做.
        assistant.approve();
        //这里boss资源还没加载完，所以还是助理帮忙
        assistant.addOrder("我找Boss健身");
        Thread.sleep(2000);
        //这里Boss已经加载完了
        // Boss刚才就被邀请过来, 现在就在现场. 所以就不需要助手转告给Boss了. 大家告诉助手的事情, Boss也会听到
        assistant.addOrder("我找Boss吃饭");
        assistant.addOrder("我找Boss喝酒");
        assistant.approve();
    }

}