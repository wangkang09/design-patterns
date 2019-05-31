package com.wangkang.design_patterns.单例模式;

import org.junit.Assert;
import org.junit.Test;

import javax.sql.DataSource;
import java.util.concurrent.*;


/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 16:32 2019/5/31
 * @Modified By:
 */
public class TeacherTest {
    static ExecutorService executor = Executors.newFixedThreadPool(6);

    @Test
    public void test() throws ExecutionException, InterruptedException {
        for (int i = 0; i < 10000; i++) {
            Future f1 =executor.submit(()->{
                Teacher.getYuQian();
            });
            Future f2 =executor.submit(()->{
                Teacher.getYuQian();
            });

            DataSource t1 =(DataSource) f1.get();
            DataSource t2 =(DataSource) f2.get();
            Assert.assertTrue(t1 == t2);
        }
    }
}