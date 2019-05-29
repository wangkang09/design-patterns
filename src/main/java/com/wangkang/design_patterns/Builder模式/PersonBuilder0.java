package com.wangkang.design_patterns.Builder模式;

/**
 * @Description: 这样的建造者不是更灵活些嘛，我觉得第一个建造者模式，可以看成结合工厂模式的建造者
 * @Author: wangkang
 * @Date: Created in 12:25 2019/5/29
 * @Modified By:
 */
public class PersonBuilder0 {
    private Person person;

    public PersonBuilder0() {
        person = new Person();
    }
    public PersonBuilder0 buildBody(String body) {
        person.setBody(body);
        return this;
    }
    public PersonBuilder0 buildHead(String head) {
        person.setHead(head);
        return this;
    }
    public PersonBuilder0 buildArmLeft(String leftArm) {
        person.setArmLeft(leftArm);
        return this;
    }
    public PersonBuilder0 buildArmRight(String rightArm) {
        person.setArmRight(rightArm);
        return this;
    }
    public PersonBuilder0 buildLegLeft(String leftLeg) {
        person.setLegLeft(leftLeg);
        return this;
    }
    public PersonBuilder0 buildLegRight(String rightLeg) {
        person.setLegRight(rightLeg);
        return this;
    }
    public Person build() {
        return person;
    }

}
