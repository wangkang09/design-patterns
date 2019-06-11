package com.wangkang.design_patterns.Decorator模式.JavaIO示例;

import java.io.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 21:48 2019/6/10
 * @Modified By:
 */
public class LowerCaseInputStreamTest {

    @Test
    public void test() throws IOException {
        int c;
        InputStream in = null;
        try {
            String path = "desing_patterns.txt";
            in = new FileInputStream(path);
            in = new BufferedInputStream(in);
            in = new LowerCaseInputStream(in);

            while ((c = in.read()) > 0) {
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }

    @Test
    public void testLujing() throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));//项目的相对路径
        URL url = this.getClass().getResource("/");//这个输出的是类路径啦！！不是项目路径，相对路径使用的是项目路径！！
        String path = url.getPath();
        System.out.println(path);
        File file = new File(path);
        // 直接junit运行方法
        for (File f : file.listFiles()) {
            System.out.println(f.getName()); // 还没有文件被编译，啥也没有
        }
    }

}