package com.atguigu.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ClassName: MyBeanPost
 * Package: com.atguigu.life
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 21:29
 * Version: v1.0
 */
public class MyBeanPost implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之前");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之后");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
