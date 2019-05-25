package com.wangkang.design_patterns.工厂模式;

/**
 * @Description: 原生的Pizaa店，显然这个类中的 orderPizza() 方法对修改不封闭：当要添加新的 type 时，需要修改旧的代码
 * @Author: wangkang
 * @Date: Created in 22:22 2019/5/24
 * @Modified By:
 */
public class PizzaStoreRaw {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            default:
                throw new IllegalArgumentException("无此类型的Pizza");
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.done();
        return pizza;
    }

}
