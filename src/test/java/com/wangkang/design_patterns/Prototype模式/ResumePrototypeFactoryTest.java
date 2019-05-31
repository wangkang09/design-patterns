package com.wangkang.design_patterns.Prototype模式;

import org.junit.Test;



/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:47 2019/5/31
 * @Modified By:
 */
public class ResumePrototypeFactoryTest {

    @Test
    public void test() throws CloneNotSupportedException {
        Resume resume = new StudentResumeFactory().createResume();

        resume.getWks().get(0).setTimeAArea("111-222");
        System.out.println(resume);
        System.out.println(StudentResumeFactory.prototype);
    }

}