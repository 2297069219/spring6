package com.atguigu.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Package: com.atguigu.life
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 21:26
 * Version: v1.0
 */
public class TestUser {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        context.close();//销毁
    }
}
