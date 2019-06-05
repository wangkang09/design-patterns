package com.wangkang.design_patterns.Adapter模式.示例2;

import org.junit.Test;

import java.util.Iterator;


/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:55 2019/6/5
 * @Modified By:
 */
public class EnumerationIteratorTest {

    @Test
    public void test() {
        Enumeration e = new Enumeration();
        Iterator it = new EnumerationIterator(e);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}