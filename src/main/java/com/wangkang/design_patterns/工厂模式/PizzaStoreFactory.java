package com.wangkang.design_patterns.工厂模式;


/**
 * @Description: 工厂模式的披萨店：具体的制造披萨的方法有子类自己决定，其实就相当于将简单工厂的工厂方法，分解成一个个小块，也即将if 拆分了。
 * 这样就可以在一定程度上对修改封闭。比如如果要在添加一个别的种类的披萨，只要重新创建一个披萨工厂的子类即可，而没有修改旧代码.
 * 实现类有：CheesePizzaFactory
 * @Author: wangkang
 * @Date: Created in 23:04 2019/5/24
 * @Modified By:
 */
public abstract class PizzaStoreFactory {

    //其实这里就相当于模板模式了
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.done();

        return pizza;
    }
    //让子类决定如何制造披萨
    abstract Pizza createPizza(String type);
}
