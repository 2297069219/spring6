package com.atguigu.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestJdbc
 * Package: com.atguigu.jdbc
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 21:07
 * Version: v1.0
 */
public class TestJdbc {

    @Test
    public void test2(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = context.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());


    }
    @Test
    public void test1(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/spring?serverTimezone=UTC");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("abc123");
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }
}
