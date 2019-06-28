package com.wangkang.design_patterns.Proxy模式.保护代理;

/**
 * @Description: 他人代理对象：不能设置别人的姓名、性别等
 * @Author: wangkang
 * @Date: Created in 11:30 2019/6/28
 * @Modified By:
 */
public class OtherPersonProxy implements PersonBean {
    private PersonBean personBean;

    public OtherPersonProxy(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public String getName() {
        return personBean.getName();
    }

    @Override
    public String getGender() {
        return personBean.getGender();
    }

    @Override
    public String getInterests() {
        return personBean.getInterests();
    }

    @Override
    public int getHotOrNotRating() {
        return personBean.getHotOrNotRating();
    }

    @Override
    public void setName(String name) throws IllegalAccessException {
        throw new IllegalAccessException("不能设置他人的名字！");
    }

    @Override
    public void setGender(String gender) throws IllegalAccessException {
        throw new IllegalAccessException("不能设置他人的性别！");
    }

    @Override
    public void setInterests(String interests) throws IllegalAccessException {
        throw new IllegalAccessException("不能设置他人的兴趣！");
    }

    @Override
    public void setHotOrNotRating(int rating) throws IllegalAccessException {
        personBean.setHotOrNotRating(rating);
    }
}
