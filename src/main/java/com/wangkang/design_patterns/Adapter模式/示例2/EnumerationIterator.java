package com.wangkang.design_patterns.Adapter模式.示例2;

import java.util.Iterator;

/**
 * @Description: 当客户端调用 Iterator 的 remove 方法时，会抛出异常，因为本身 Enumeration 并没有 remove 方法，所有
 * @Author: wangkang
 * @Date: Created in 9:26 2019/6/5
 * @Modified By:
 */
public class EnumerationIterator implements Iterator {

    Enumeration e;

    public EnumerationIterator(Enumeration e) {
        this.e = e;
    }

    @Override
    public boolean hasNext() {
        return e.hasMoreElements();
    }

    @Override
    public Object next() {
        return e.nextElement();
    }
}
