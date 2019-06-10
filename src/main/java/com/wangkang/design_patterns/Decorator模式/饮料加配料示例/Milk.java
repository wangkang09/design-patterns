package com.wangkang.design_patterns.Decorator模式.饮料加配料示例;

/**
 * @Description: 具体装饰者，如果装饰者单一，也可以不定义抽象装饰者，直接定义具体装饰者来继承抽象被装饰者
 * @Author: wangkang
 * @Date: Created in 17:18 2019/6/6
 * @Modified By:
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.size = Size.GRADNDE;
    }

    public Milk(Beverage beverage,Size size) {
        this.beverage =  beverage;
        this.size = size;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.34;
    }
}
