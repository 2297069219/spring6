package com.atguigu.auto.controller;

import com.atguigu.auto.service.UserService;

/**
 * ClassName: UserController
 * Package: com.atguigu.auto.controller
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 21:40
 * Version: v1.0
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println();
    }

}
