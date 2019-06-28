package com.wangkang.design_patterns.Proxy模式.保护代理;


import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 12:50 2019/6/28
 * @Modified By:
 */
public class OtherPersonProxyTest {
    @Test
    public void test() {
        PersonBean otherPerson = new OtherPersonProxy(new PersonBeanImpl());

        try {
            otherPerson.setHotOrNotRating(2);
        } catch (IllegalAccessException e) {
            Assert.fail("不应该报错");
        }

        try {
            otherPerson.setName("wk");
        } catch (IllegalAccessException e) {
            return;
        }
        Assert.fail("应该报错的");
    }
}