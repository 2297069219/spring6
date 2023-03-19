package com.atguigu.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestBook
 * Package: com.atguigu.di
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 19:43
 * Version: v1.0
 */
public class TestBook {

    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean_dl.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
}
