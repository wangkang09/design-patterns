package com.wangkang.design_patterns.工厂模式;

/**
 * @Description: 实现类有ChineseIngredientFactory,JapenIngredientFactory
 * @Author: wangkang
 * @Date: Created in 9:54 2019/5/25
 * @Modified By:
 */
public interface IIngredientFactory {
    Sauce createSauce();
    Cheese createCheese();
}
