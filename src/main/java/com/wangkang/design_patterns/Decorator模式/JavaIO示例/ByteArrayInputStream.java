package com.wangkang.design_patterns.Decorator模式.JavaIO示例;

import java.io.IOException;

/**
 * @Description: 具体组件类，这个类读取的数据流源是字节数组，即传入一个字节数组给这个类
 * @Author: wangkang
 * @Date: Created in 21:00 2019/6/10
 * @Modified By:
 */
public class ByteArrayInputStream extends InputStream {
    protected byte buf[];

    //初始化时必须传入一个字节数组，当作字节流
    public ByteArrayInputStream(byte buf[]) {
        this.buf = buf;
    }

    @Override
    public int read() throws IOException {
        return 0;
    }
}
