package com.wangkang.design_patterns.Decorator模式.JavaIO示例;

import java.io.IOException;

/**
 * @Description: io抽象装饰者，继承抽象组件类，并关联一个抽象组件，达到装饰某个具体组件的目的
 * @Author: wangkang
 * @Date: Created in 17:46 2019/6/10
 * @Modified By:
 */
public class FilterInputStream extends InputStream{
    protected volatile InputStream in;

    @Override
    public int read() throws IOException {
        return in.read();
    }

    public FilterInputStream(InputStream in) {
        this.in = in;
    }
}
