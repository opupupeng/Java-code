package com.java.demo;

/**
 * java中的变量
 */
public class Demo02 {

    public static String NAME = "张三";
    public static void main(String[] args) {
        //变量的创建方式:
        //1.通过定义直接赋值的方式
        int a = 10;
        System.out.println(a);
        //2.先定义变量,再进行赋值(也可以不赋值(有可能会出现初始化异常))
        int b;
        b =20;
        System.out.println(b);

        //字符变量
        char c = 'a';

        String d = "adb中国";
        //布尔变量
        boolean flag  = true;
        System.out.println(flag);

        //2.多个变量的定义
        int e = 30,f = 40,g =50;
        System.out.println(e+","+f+","+g);

        //先定义再赋值
        int h ,j,k;
        h=50;
        j=30;
        k=20;
        System.out.println(h+","+j+","+k);

    }
    //用来测试方法
    public void findAll(){

    }
}
