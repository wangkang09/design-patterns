package com.wangkang.design_patterns.Decorator模式.饮料加配料示例;

import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 15:34 2019/6/10
 * @Modified By:
 */
public class MilkTest {
    @Test
    public void test() {
        Beverage beverage = new Coffee(Size.TALL);
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}