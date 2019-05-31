package com.wangkang.design_patterns.Prototype模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:30 2019/5/31
 * @Modified By:
 */
public abstract class ResumePrototypeFactory {
    public abstract Resume createResume() throws CloneNotSupportedException;
}
