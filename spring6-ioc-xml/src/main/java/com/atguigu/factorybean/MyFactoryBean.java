package com.atguigu.factorybean;

import com.atguigu.life.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName: FactoryBean
 * Package: com.atguigu.factorybean
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 21:35
 * Version: v1.0
 */
public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
