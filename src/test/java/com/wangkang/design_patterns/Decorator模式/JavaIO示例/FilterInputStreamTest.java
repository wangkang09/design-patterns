package com.wangkang.design_patterns.Decorator模式.JavaIO示例;


import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 21:08 2019/6/10
 * @Modified By:
 */
public class FilterInputStreamTest {

    @Test
    public void test() {
        InputStream inputStream = new FileInputStream();//创建一个文件输入流
        inputStream = new BufferedInputStream(inputStream);//使用缓存来包装文件输入流
        inputStream = new DataInputStream(inputStream);//再使用格式化数据类型包装输入流
    }

}