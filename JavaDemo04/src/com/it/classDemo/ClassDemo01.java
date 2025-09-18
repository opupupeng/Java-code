package com.it.classDemo;

import com.it.entity.Student;

/**
 * 调用对象
 */
public class ClassDemo01 {
    public static void main(String[] args) {
        //在使用
        Student student = new Student();
        student.eat();
        int age = student.age;
        String name = student.name;
        System.out.println(name);
        //在对象属性中设置值
        //姓名
        student.name = "九连环";
        student.age=20 ;
        student.address="最尿之人";
        System.out.println("姓名:"+student.name);
        System.out.println("年龄:"+student.age);
        System.out.println("地址:"+student.address);
        /*
        在类中调用定义的对象具体内容：
        1.先创建该类 通过new的关键字来进行创建 比如：Student s = new Student（）；
        2.调用对象中的属性和方法
        具体的格式
         */

    }
}