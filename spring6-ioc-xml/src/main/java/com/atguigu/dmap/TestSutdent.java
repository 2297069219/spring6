package com.atguigu.dmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestSutdent
 * Package: com.atguigu.dmap
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 20:35
 * Version: v1.0
 */
public class TestSutdent {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-dimpa.xml");

    }
}
