package com.wangkang.design_patterns.Decorator模式.JavaIO示例;


import java.io.IOException;

/**
 * @Description: 具体组件类，提供文件流功能
 * @Author: wangkang
 * @Date: Created in 17:17 2019/6/10
 * @Modified By:
 */
public class FileInputStream extends InputStream{
    //从file的输入流中读取一个字节，返回-1表示读完了
    @Override
    public int read() throws IOException {
        return 0;
    }
    //从file的输入流中读取b.len个字节，并存入b中，返回-1表示读完了
    public int read(byte[] b) throws IOException {
        return 0;
    }
    //代码略


}
