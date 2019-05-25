package com.wangkang.design_patterns.工厂模式;

/**
 * @Description: 简单工厂：相对于原生的代码，仅仅是封装了变化，虽然还是对修改开放，但是修改的代价要低一点（不需要处处修改）
 * @Author: wangkang
 * @Date: Created in 22:51 2019/5/24
 * @Modified By:
 */
public class PizzaStoreSimple {

    public Pizza orderPizza(String type) {
        Pizza pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.done();
        return pizza;
    }
}
