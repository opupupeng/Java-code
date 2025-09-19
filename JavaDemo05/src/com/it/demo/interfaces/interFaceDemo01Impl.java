package com.it.demo.interfaces;

//接口的实现类    public class 类名 implements 对应的接口
public class interFaceDemo01Impl implements InterFaceDemo01{
    @Override
    public void run() {
        System.out.println("实现类中的方法执行......");
    }

    @Override
    public String findAll(int id) {
        String str = "通过id"+id+"查出了5个对象";
        return str;
    }
}
