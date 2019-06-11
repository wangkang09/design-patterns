package com.wangkang.design_patterns.Decorator模式.JavaIO示例;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: 这是一个基于 Java IO 包，真实的具体装饰者的扩展！使输入流的所有字符变成小写
 * @Author: wangkang
 * @Date: Created in 21:45 2019/6/10
 * @Modified By:
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }
}
