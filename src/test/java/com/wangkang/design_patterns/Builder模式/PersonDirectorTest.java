package com.wangkang.design_patterns.Builder模式;

import org.junit.Test;


/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 12:23 2019/5/29
 * @Modified By:
 */
public class PersonDirectorTest {

    @Test
    public void test() {
        PersonDirector pd = new PersonDirector(new PersonThinBuilder());
        Person p = pd.createPerson();
        System.out.println(p);
    }

}