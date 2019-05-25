package com.wangkang.design_patterns.工厂模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 13:46 2019/5/25
 * @Modified By:
 */
public class ChinesePizzaFactory extends PizzaStoreAbstractFactory {
    @Override
    PizzaCustom createPizza(String type) {
        return new ChinesePizzaCustom("中国",1,new ChineseIngredientFactory());
    }
}
