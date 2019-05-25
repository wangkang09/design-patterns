package com.wangkang.design_patterns.工厂模式;


import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 22:56 2019/5/24
 * @Modified By:
 */
public class PizzaStoreSimpleTest {
    @Test
    public void test() {
        new PizzaStoreSimple().orderPizza("cheese");
        try {
            new PizzaStoreSimple().orderPizza("ddga");
            Assert.fail();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}