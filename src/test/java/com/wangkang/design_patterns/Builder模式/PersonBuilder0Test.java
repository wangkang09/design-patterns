package com.wangkang.design_patterns.Builder模式;


import org.junit.Test;

/**
 * @Description: 这样不是更灵活吗，再结合抽象工厂模式，创建各个部件，最后通过建造者模式选取需要的部件
 * @Author: wangkang
 * @Date: Created in 12:34 2019/5/29
 * @Modified By:
 */
public class PersonBuilder0Test {

    @Test
    public void test() {
        Person p = new PersonBuilder0().buildArmLeft("大左胳膊").buildArmLeft("小右胳膊").build();
        System.out.println(p);//没有手和头
    }

}