package com.atguigu.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Package: com.atguigu.spring6
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 16:35
 * Version: v1.0
 */
public class TestUser {

    private Logger logger= LoggerFactory.getLogger(TestUser.class);
    @Test
    public void test1(){
        //方法 加载Spring文件 加载
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean.xml");
        //获取创建的对象
        User user = (User)context.getBean("user");
        System.out.println(user);

        user.add();
        //手动写入日志
        logger.info("#####++++》》》》》>>>");
    }
}
