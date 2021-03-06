package com.wangkang.design_patterns.单例模式;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 15:33 2019/5/31
 * @Modified By:
 */
public enum Pool {
    JVM_POOL("jvm",DataSourceBuilder.create().type(ComboPooledDataSource.class).build()),
    ORACLE_POOL("oracle",DataSourceBuilder.create().type(HikariDataSource.class).build()),
    MYSQL_POOL("mysql",DataSourceBuilder.create().type(DruidDataSource.class).build());
    private String name;
    private DataSource dataSource;
    Pool (String name,DataSource dataSource) {
        System.out.println(name + " " + dataSource.toString());
        this.name = name;
        this.dataSource = dataSource;
    }
    public DataSource getDataSource() {
        return dataSource;
    }
}
