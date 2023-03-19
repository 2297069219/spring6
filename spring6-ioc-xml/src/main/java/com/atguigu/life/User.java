package com.atguigu.life;

/**
 * ClassName: User
 * Package: com.atguigu.life
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 21:21
 * Version: v1.0
 */
public class User {

    private String name;

    public User() {
        System.out.println("constructor non");
    }

    public User(String name) {
        this.name = name;
        System.out.println("have");
    }

    public String getName() {
        System.out.println(1);
        return name;
    }

    public void setName(String name) {
        System.out.println(2);
        this.name = name;
    }

    public void initMethod(){
        System.out.println(3);

    }

    public void destroyMethod(){
        System.out.println(4);
    }
}
