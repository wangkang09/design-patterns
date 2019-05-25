package com.wangkang.design_patterns.工厂模式;


import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 13:59 2019/5/25
 * @Modified By:
 */
public class PizzaStoreAbstractFactoryTest {

    @Test
    public void test() {
        PizzaStoreAbstractFactory pizzaStore = new ChinesePizzaFactory();
        pizzaStore.orderPizza("");
    }

}