package com.wangkang.design_patterns.Decorator模式.JavaIO示例;


import java.io.IOException;

/**
 * @Description: 具体装饰类，给InputStream添加缓存功能。即，当需要读取数据时，先从 buf[] 中获取，如果没有在把数据读入缓存
 * @Author: wangkang
 * @Date: Created in 17:48 2019/6/10
 * @Modified By:
 */
public class BufferedInputStream extends FilterInputStream {
    private static int DEFAULT_BUFFER_SIZE = 8192;
    protected volatile byte buf[];
    public BufferedInputStream(InputStream in) {
        this(in, DEFAULT_BUFFER_SIZE);
    }
    public BufferedInputStream(InputStream in, int size) {
        super(in);
        if (size <= 0) {
            throw new IllegalArgumentException("Buffer size <= 0");
        }
        buf = new byte[size];
    }
    public synchronized int read() throws IOException {
        //这里返回 buf[] 中的一个字节，如果没有就通过 InputStream 去读取，并放入 buf[] 中
        return 0;
    }
}
