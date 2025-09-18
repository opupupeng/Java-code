package com.it.entity;

/**
 * 学生对象
 */
public class Student {
    //属性 姓名 年龄 地址 性别
    public String name;
    public int age;
    public String address;
    public String sex;
    //行为（在java里用方法代替）
    //上学 放学 吃饭 跑
    public void goToSchool(){
        System.out.println("开始上学了......");
    }
    public void leaveSchool(){
        System.out.println("放学了......");
    }
    public void eat(){
        System.out.println("吃饭了......");
    }
    public void run(){
        System.out.println("跑步了......");
    }
}
