package com.wangkang.design_patterns.工厂模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 13:37 2019/5/25
 * @Modified By:
 */
public class ChineseIngredientFactory implements IIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new ChineseSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChineseCheese();
    }
}
