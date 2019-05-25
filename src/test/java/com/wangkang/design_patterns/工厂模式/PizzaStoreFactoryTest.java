package com.wangkang.design_patterns.工厂模式;


import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 9:29 2019/5/25
 * @Modified By:
 */
public class PizzaStoreFactoryTest {

    @Test
    public void test() {
        //这时客户端需要自己选择特定的 披萨店了，而不是仅仅是传入名字，服务端通过名字选择相应的披萨
        PizzaStoreFactory pizzaStore = new CheesePizzaFactory();
        pizzaStore.orderPizza("");

    }

}