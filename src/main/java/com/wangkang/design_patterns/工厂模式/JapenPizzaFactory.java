package com.wangkang.design_patterns.工厂模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 15:48 2019/5/25
 * @Modified By:
 */
public class JapenPizzaFactory extends PizzaStoreAbstractFactory {
    @Override
    PizzaCustom createPizza(String type) {
        return new JapenPizzaCustom("日本",2,new JapenIngredientFactory());
    }
}
