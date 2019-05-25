package com.wangkang.design_patterns.工厂模式;


import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 22:35 2019/5/24
 * @Modified By:
 */
public class PizzaStoreRawTest {

    @Test
    public void test() {
        new PizzaStoreRaw().orderPizza("cheese");
        try {
            new PizzaStoreRaw().orderPizza("ddga");
            Assert.fail();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}