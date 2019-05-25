package com.wangkang.design_patterns.工厂模式;

import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 15:24 2019/5/25
 * @Modified By:
 */
public class SPITest {
    @Test
    public void test() {
        ServiceLoader<PizzaStoreAbstractFactory> serviceLoader = ServiceLoader.load(PizzaStoreAbstractFactory.class);
        Iterator<PizzaStoreAbstractFactory> iter = serviceLoader.iterator();
        while (iter.hasNext()) {
            PizzaStoreAbstractFactory proxy = iter.next();
            proxy.orderPizza("");
            break;
        }

    }
}
