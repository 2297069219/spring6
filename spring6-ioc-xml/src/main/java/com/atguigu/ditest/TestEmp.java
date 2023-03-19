package com.atguigu.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestEmp
 * Package: com.atguigu.ditest
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 20:08
 * Version: v1.0
 */
public class TestEmp {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-ditest.xml");
        Employee employee=context.getBean("emp", Employee.class);

    }

}
