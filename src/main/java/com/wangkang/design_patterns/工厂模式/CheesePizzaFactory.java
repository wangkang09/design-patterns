package com.wangkang.design_patterns.工厂模式;

/**
 * @Description: 添加新种类的披萨只要创建一个新的披萨店即可
 * @Author: wangkang
 * @Date: Created in 23:08 2019/5/24
 * @Modified By:
 */
public class CheesePizzaFactory extends PizzaStoreFactory {
    @Override
    Pizza createPizza(String type) {
        //这里可以根据 type 来 switch 创建某个特定的对象
        //一般情况下就直接创建对象了，这个type是没有的

        return new CheesePizza();
    }
}
