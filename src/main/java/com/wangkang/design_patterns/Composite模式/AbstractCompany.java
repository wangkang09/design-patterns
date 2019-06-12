package com.wangkang.design_patterns.Composite模式;

import java.util.Objects;

/**
 * @Description: 抽象Component
 * @Author: wangkang
 * @Date: Created in 11:04 2019/6/12
 * @Modified By:
 */
public abstract class AbstractCompany {
    protected String name;

    public AbstractCompany(String name) {
        this.name = name;
    }
    //定义默认方法，抛出异常
    public boolean add(AbstractCompany company) {
        throw new UnsupportedOperationException("不支持的操作");
    }
    public boolean remove(AbstractCompany company) {
        throw new UnsupportedOperationException("不支持的操作");
    }
    public void display(int depth) {
        throw new UnsupportedOperationException("不支持的操作");
    }
    public void LineOfDuty() {
        throw new UnsupportedOperationException("不支持的操作");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCompany that = (AbstractCompany) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
