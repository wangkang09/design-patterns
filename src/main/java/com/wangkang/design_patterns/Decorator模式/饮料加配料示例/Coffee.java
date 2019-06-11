package com.wangkang.design_patterns.Decorator模式.饮料加配料示例;

import static com.wangkang.design_patterns.Decorator模式.饮料加配料示例.Size.TALL;

/**
 * @Description: 具体组件：所有的具体组件也可以通过工厂模式得到
 * @Author: wangkang
 * @Date: Created in 17:15 2019/6/6
 * @Modified By:
 */
public class Coffee extends Beverage {
    public Coffee() {
        this.description = "coffee";
        this.size = Size.GRADNDE;//默认为中杯
    }
    public Coffee(Size size) {
        this.description = "coffee";
        this.size = size;
    }
    //根据不同的大小返回不同的值
    @Override
    public double cost() {
        if (size == Size.VENTI) {
            return 2.8;
        } else if (size == TALL){
            return 0.8;
        } else {
            return 1.8;
        }
    }
}
