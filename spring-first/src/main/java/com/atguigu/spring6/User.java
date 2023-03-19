package com.atguigu.spring6;

import org.junit.jupiter.api.Test;

/**
 * ClassName: User
 * Package: com.atguigu.spring6
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 16:31
 * Version: v1.0
 */
public class User {

    public User(){
        System.out.println("无参数构造执行");
    }
    public void add(){
        System.out.println("add......");
    }
    
    @Test 
    public void test2() throws Exception {
        //反射创建对象
        Class clazz = Class.forName("com.atguigu.spring6.User");
        //jdk17过时了 clazz.newInstance()
        User user = (User)clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);



    }        
}
