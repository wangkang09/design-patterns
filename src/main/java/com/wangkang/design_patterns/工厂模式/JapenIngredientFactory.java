package com.wangkang.design_patterns.工厂模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 13:38 2019/5/25
 * @Modified By:
 */
public class JapenIngredientFactory implements IIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new JapenSauce();
    }

    @Override
    public Cheese createCheese() {
        return new JapenCheese();
    }
}
