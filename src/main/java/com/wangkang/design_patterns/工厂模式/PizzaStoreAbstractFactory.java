package com.wangkang.design_patterns.工厂模式;

/**
 * @Description: 抽象工厂会套用工厂模式，只是 createPizza() 方法中会创建多个产品。抽象工厂的核心类是：IIngredientFactory，它负责创建产品家族
 * @Author: wangkang
 * @Date: Created in 13:40 2019/5/25
 * @Modified By:
 */
public abstract class PizzaStoreAbstractFactory {
    //其实这里就相当于模板模式了
    public PizzaCustom orderPizza(String type) {
        PizzaCustom pizza = createPizza(type);
        pizza.prepareIngredient();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.done();

        return pizza;
    }
    //让子类决定如何制造披萨
    abstract PizzaCustom createPizza(String type);
}
