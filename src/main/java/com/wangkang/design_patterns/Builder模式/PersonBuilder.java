package com.wangkang.design_patterns.Builder模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 11:52 2019/5/29
 * @Modified By:
 */
public abstract class PersonBuilder {

    Person person;
    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();

}
