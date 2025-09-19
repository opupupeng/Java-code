package com.it.demo.entity;

/**
 * 学生类
 */
public class Student extends Parent{
    public String classes;

    public void study(){
        System.out.println(name+"正在上课.....");
    }

}
