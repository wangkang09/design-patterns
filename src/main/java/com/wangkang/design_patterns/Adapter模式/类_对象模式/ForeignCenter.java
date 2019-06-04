package com.wangkang.design_patterns.Adapter模式.类_对象模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:54 2019/6/4
 * @Modified By:
 */
public class ForeignCenter extends ForeignPlayer {

    public ForeignCenter(String 名字) {
        super(名字);
    }

    @Override
    public void 进攻() {
        System.out.println("中锋"+super.get名字()+"进攻!");

    }
    @Override
    public void 防守() {
        System.out.println("中锋"+super.get名字()+"防守!");
    }
}
