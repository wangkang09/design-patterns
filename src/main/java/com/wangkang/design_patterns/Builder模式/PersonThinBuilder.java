package com.wangkang.design_patterns.Builder模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 12:02 2019/5/29
 * @Modified By:
 */
public class PersonThinBuilder extends PersonBuilder {

    public PersonThinBuilder() {
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("小头");
    }

    @Override
    public void buildBody() {
        person.setBody("小身体");
    }

    @Override
    public void buildArmLeft() {
        person.setArmLeft("小左手");
    }

    @Override
    public void buildArmRight() {
        person.setArmRight("小右手");
    }

    @Override
    public void buildLegLeft() {
        person.setLegLeft("小左腿");
    }

    @Override
    public void buildLegRight() {
        person.setLegRight("小右腿");
    }
}
