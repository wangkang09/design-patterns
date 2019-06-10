package com.wangkang.design_patterns.Decorator模式.饮料加配料示例;

/**
 * @Description: 具体被装饰者：所有的具体被装饰者也可以通过工厂模式得到
 * @Author: wangkang
 * @Date: Created in 17:15 2019/6/6
 * @Modified By:
 */
public class Coffee extends Beverage {
    public Coffee() {
        description = "coffee";
    }

    @Override
    public double cost() {
        return 1.8;
    }
}
