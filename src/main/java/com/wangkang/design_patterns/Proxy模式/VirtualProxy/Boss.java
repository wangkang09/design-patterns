package com.wangkang.design_patterns.Proxy模式.VirtualProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:35 2019/6/28
 * @Modified By:
 */
public class Boss implements Approvable {
    List<String> orders;
    public Boss() {
        System.out.println("\nBoss出现...\n");
        this.orders = new ArrayList<>();    }

    public Boss(List<String> orders) {
        if (orders != null) {
            this.orders = orders;
        } else {
            this.orders = new ArrayList<>();
        }
    }
    public void addOrder(String order) {
        this.orders.add(order);
    }
    @Override
    public void approve() {
        for (int i = orders.size()-1;i>=0; i--) {
            System.out.println("Boss处理了任务<" + orders.remove(i) + ">");
        }
        System.out.println();
    }


}
