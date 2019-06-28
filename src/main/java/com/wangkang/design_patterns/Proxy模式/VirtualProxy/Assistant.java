package com.wangkang.design_patterns.Proxy模式.VirtualProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:44 2019/6/28
 * @Modified By:
 */
public class Assistant implements Approvable {
    List<String> orders;
    volatile Boss boss;

    public Assistant() {
        orders = new ArrayList<>();
    }
    public void addOrder(String order) {
        //因为加载真正资源是异步的，所以要加锁，防止和异步程序起冲突
        if(boss == null) {
            //异步方法和此方法都会走到这里，这里保证了只有一个会成功获取
            //当异步方法先获取时，表明 boss资源已加载完，可以调用真正对象了
            //当次方法先获取时，异步程序就不能进去了，因为异步程序要使用 orders 列表，而次方法要修改 orders 列表
            synchronized (this) {
                if(boss == null) {
                    this.orders.add(order);
                } else {
                    boss.addOrder(order);
                }
            }
        } else {
            System.out.println("Boss亲自将<" + order + ">任务添加到列表");
            boss.addOrder(order);
        }
    }
    @Override
    public void approve() {
        //只有在加载资源的时候是异步的，资源加载完之后就是同步的了
        if(boss == null) {
            //重启一个线程去加载资源，这个过程很耗时，所以异步加载
            initBoss();
        } else {
            boss.approve();
        }
    }

    private void initBoss() {
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (boss == null) {
                synchronized (this) {
                    if (boss == null) {
                        boss = new Boss(orders);
                    }
                }
            }
            //加载完了在调用真实对象的处理方法
            boss.approve();
        }).start();
    }

}
