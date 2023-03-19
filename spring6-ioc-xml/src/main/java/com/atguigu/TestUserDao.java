package com.atguigu;

import com.atguigu.bean.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUserDao
 * Package: com.atguigu
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 19:33
 * Version: v1.0
 */
public class TestUserDao {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        UserDaoImpl bean = context.getBean(UserDaoImpl.class);
        System.out.println(bean);

        bean.run();
    }

}
