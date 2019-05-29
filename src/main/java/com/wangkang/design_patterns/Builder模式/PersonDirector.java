package com.wangkang.design_patterns.Builder模式;

/**
 * @Description: 指挥者：通过引入具体的Builder实例，最后调用 cratePerson() 方法，在方法中抽象过程。我不知道这个指挥者的意义在哪，直接在 Builder 中新建一个 build() 方法，在其中调用过程不就行了。
 * @Author: wangkang
 * @Date: Created in 12:04 2019/5/29
 * @Modified By:
 */
public class PersonDirector {
    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    public Person createPerson() {
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildBody();
        pb.buildHead();
        pb.buildLegLeft();
        pb.buildLegRight();
        return pb.person;
    }

}
