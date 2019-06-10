package com.wangkang.design_patterns.Decorator模式.JavaIO示例;

import java.io.Closeable;
import java.io.IOException;

/**
 * @Description: 抽象组件类(Component)
 * @Author: wangkang
 * @Date: Created in 17:15 2019/6/10
 * @Modified By:
 */
public abstract class InputStream implements Closeable {
    public abstract int read() throws IOException;
    public void close() throws IOException {}

}
