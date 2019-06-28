package com.wangkang.design_patterns.Proxy模式.保护代理;

/**
 * @Description: 统一接口
 * @Author: wangkang
 * @Date: Created in 11:20 2019/6/28
 * @Modified By:
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name) throws IllegalAccessException;
    void setGender(String gender) throws IllegalAccessException;
    void setInterests(String interests) throws IllegalAccessException;
    void setHotOrNotRating(int rating) throws IllegalAccessException;
}
