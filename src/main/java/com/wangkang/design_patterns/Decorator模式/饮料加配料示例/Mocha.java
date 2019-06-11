package com.wangkang.design_patterns.Decorator模式.饮料加配料示例;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 15:42 2019/6/10
 * @Modified By:
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.33;
    }
}
