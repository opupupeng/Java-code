package com.it.demo.interfaces;

public class InterFaceDemo01Test {
    public static void main(String[] args) {
        //1.创建接口
        InterFaceDemo01 ifd = new interFaceDemo01Impl();
        //调用接口中的方法
        ifd.run();
        String all = ifd.findAll(InterFaceDemo01.id);
        System.out.println(all);
    }
}
