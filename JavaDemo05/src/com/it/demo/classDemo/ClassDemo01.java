package com.it.demo.classDemo;

import com.it.demo.entity.Parent;
import com.it.demo.entity.Student;
import com.it.demo.entity.Teacher;

public class ClassDemo01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name="九连环";
        System.out.println("通过继承设置属性值"+student.name);
        student.classes="java1班";
        System.out.println(student.classes);

        student.eat();

        Teacher teacher=new Teacher();
        teacher.address="河师大";
        System.out.println(teacher.address);
        teacher.name="西凉王";
        System.out.println(teacher.name);
    }
}
