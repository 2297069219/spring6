package com.atguigu.ditest;

/**
 * ClassName: Employee
 * Package: com.atguigu.ditest
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 19:58
 * Version: v1.0
 */
public class Employee {

    //一个员工属于一个部门
    private Department department;
    private String name;
    private Integer age;

    public void work(){
        System.out.println("work");
    }

    public Employee() {
    }

    public Employee(Department department, String name, Integer age) {
        this.department = department;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
