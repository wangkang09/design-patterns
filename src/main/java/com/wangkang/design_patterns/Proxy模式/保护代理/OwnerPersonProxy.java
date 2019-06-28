package com.wangkang.design_patterns.Proxy模式.保护代理;

/**
 * @Description: 自己代理对象：不能设置自己的受欢迎率
 * @Author: wangkang
 * @Date: Created in 11:27 2019/6/28
 * @Modified By:
 */
public class OwnerPersonProxy implements PersonBean {

    private PersonBean personBean;

    public OwnerPersonProxy(PersonBean personBean) {
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
        personBean.setName(name);
    }

    @Override
    public void setGender(String gender) throws IllegalAccessException {
        personBean.setGender(gender);
    }

    @Override
    public void setInterests(String interests) throws IllegalAccessException {
        personBean.setInterests(interests);
    }

    @Override
    public void setHotOrNotRating(int rating) throws IllegalAccessException {
        throw new IllegalAccessException("自己不能给自己打分！");
    }
}
