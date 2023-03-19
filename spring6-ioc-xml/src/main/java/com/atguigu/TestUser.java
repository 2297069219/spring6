package com.atguigu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Package: com.atguigu
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 19:21
 * Version: v1.0
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean.xml");

        //获取Bean
        //根据id获取Bean Get
        User user = (User) context.getBean("user");
        System.out.println("id"+user);

        //类型获取Bean
        User user1 = context.getBean(User.class);
        System.out.println(user1);

        User user2 = context.getBean("user", User.class);
        System.out.println(user2);



    }

}
