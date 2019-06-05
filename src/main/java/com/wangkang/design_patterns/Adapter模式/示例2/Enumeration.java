package com.wangkang.design_patterns.Adapter模式.示例2;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 9:27 2019/6/5
 * @Modified By:
 */
public class Enumeration {
    int count = 0;

    public boolean hasMoreElements() {

        return count++ < 10;
    }

    public Object nextElement() {
        return "String";
    }
}
