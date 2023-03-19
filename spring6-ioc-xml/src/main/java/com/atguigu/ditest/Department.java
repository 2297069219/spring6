package com.atguigu.ditest;

import java.util.List;

/**
 * ClassName: Department
 * Package: com.atguigu.ditest
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 19:58
 * Version: v1.0
 */
public class Department {

    private List<Employee> list;
    private String dName;

    public void info(){
        System.out.println(dName);
    }

    public Department() {
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

    public Department(String dName) {
        this.dName = dName;
    }

    public String getdName() {
        return dName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dName='" + dName + '\'' +
                '}';
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
}
