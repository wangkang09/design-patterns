package com.wangkang.design_patterns.工厂模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 9:47 2019/5/25
 * @Modified By:
 */
public class JapenPizzaCustom extends PizzaCustom {
    IIngredientFactory iIngredientFactory;

    public JapenPizzaCustom(String name, Integer size, IIngredientFactory iIngredientFactory) {
        super(name, size);
        this.iIngredientFactory = iIngredientFactory;
    }
    //名字尺寸都可以自己定义
    public JapenPizzaCustom() {
        super("日本披萨",3);
    }
    //但是加盟店的原料，应该是总店统一配置的，不然有些加盟店偷工减料，影响声誉
    //这时候就需要一个原料工厂了
    @Override
    void prepareIngredient() {
        System.out.println("开始准备原料...");
        this.cheese = iIngredientFactory.createCheese();
        this.sauce = iIngredientFactory.createSauce();
        System.out.println("原料 "+ cheese + "、"+sauce + " 准备完成！");
    }
}
