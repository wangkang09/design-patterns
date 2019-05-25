package com.wangkang.design_patterns.工厂模式;

/**
 * @Description: pizza 的简单工厂
 * @Author: wangkang
 * @Date: Created in 22:52 2019/5/24
 * @Modified By:
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
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
        return pizza;
    }
}
