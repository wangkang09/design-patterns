package com.wangkang.design_patterns.Decorator模式.饮料加配料示例;

/**
 * @Description: 具体装饰者，如果装饰者单一，也可以不定义抽象装饰者，直接定义具体装饰者来继承抽象被装饰者
 * @Author: wangkang
 * @Date: Created in 17:18 2019/6/6
 * @Modified By:
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage,Size.GRADNDE);//默认中杯
    }

    public Milk(Beverage beverage,Size size) {
        super(beverage,size);
    }
    @Override
    public String getDescription() {
        return super.getBeverage().getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return super.getBeverage().cost() + 0.34;
    }
}
