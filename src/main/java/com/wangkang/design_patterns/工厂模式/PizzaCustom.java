package com.wangkang.design_patterns.工厂模式;

/**
 * @Description: 自定义的披萨，说明一个披萨产品是由多个产品家族共同合成的。抽象工厂主要解决产品家族的问题
 * @Author: wangkang
 * @Date: Created in 9:34 2019/5/25
 * @Modified By:
 */
public abstract class PizzaCustom extends Pizza {
    Sauce sauce;
    Cheese cheese;

    public PizzaCustom(String name, Integer size) {
        super(name, size);
    }

    // 不同披萨子类，自定义自己需要的合成原料
    abstract void prepareIngredient();
}
