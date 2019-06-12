package com.wangkang.design_patterns.Decorator模式.饮料加配料示例;

/**
 * @Description: abstract component：抽象组件
 * @Author: wangkang
 * @Date: Created in 17:10 2019/6/6
 * @Modified By:
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";//需要被子类继承，所有不能定义为私有
    //因为所有的具体组件都返回的是 description，所以不需要设置为抽象类
    public String getDescription() {
        return description;
    }
    public abstract double cost();
    protected Size size;
}
