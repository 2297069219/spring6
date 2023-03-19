package com.atguigu.bean;

/**
 * ClassName: PersonDaoImpl
 * Package: com.atguigu.bean
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 19:36
 * Version: v1.0
 */
public class PersonDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("PersonDao.run()");
    }
}
