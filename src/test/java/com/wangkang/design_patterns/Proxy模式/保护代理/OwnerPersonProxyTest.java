package com.wangkang.design_patterns.Proxy模式.保护代理;


import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 11:51 2019/6/28
 * @Modified By:
 */
public class OwnerPersonProxyTest {
    @Test
    public void test() {
        PersonBean ownerPerson = new OwnerPersonProxy(new PersonBeanImpl());



        try {
            ownerPerson.setName("wk");
        } catch (IllegalAccessException e) {
            Assert.fail("不应该报错的");
        }
        try {
            ownerPerson.setHotOrNotRating(2);
        } catch (IllegalAccessException e) {
            return;

        }
        Assert.fail("应该报错的");
    }

}