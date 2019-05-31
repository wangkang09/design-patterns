package com.wangkang.design_patterns.单例模式;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 18:02 2019/5/31
 * @Modified By:
 */
public class PoolTest {
    static ExecutorService executor = Executors.newFixedThreadPool(6);

    @Test
    public void test() throws ExecutionException, InterruptedException {
        Teacher t0 = null;
        for (int i = 0; i < 10000; i++) {
            Future f1 =executor.submit(()->{
                Pool.ORACLE_POOL.getDataSource();
            });
            Future f2 =executor.submit(()->{
                Pool.ORACLE_POOL.getDataSource();
            });

            Teacher t1 =(Teacher) f1.get();
            Teacher t2 =(Teacher) f2.get();
            Assert.assertTrue(t1 == t2);
            if (i == 9999) t0 = t1;
        }

        Assert.assertFalse(t0 == Pool.JVM_POOL.getDataSource());
    }

}