package com.wangkang.design_patterns.Decorator模式.饮料加配料示例;

/**
 * @Description: 抽象装饰者：调料
 * @Author: wangkang
 * @Date: Created in 17:13 2019/6/6
 * @Modified By:
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    protected Size size;//装饰者也可以有自己的属性，如果是公共的就可以提到抽象装饰者中，私有属性一般是用来更加不同的值，做不同的装饰吧
    public abstract String getDescription();

}
