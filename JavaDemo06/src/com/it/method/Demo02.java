package com.it.method;

/**
 * final关键字   可以去修饰类  方法   变量   被修饰的方法、变量、类是不能够被改变的
 *
 * 如果final 修饰类  是不能够被继承的
 * 如果final 修饰方法  是不能够被重写的
 * 如果final  修饰变量  是不能够被重新赋值的
 */
public class Demo02 {
    public static void main(String[] args) {
        final int a = 20;
        String str = "中国";
       str =  str+"好大";

       StringBuffer   st = new StringBuffer();//字符拼接的类
        StringBuilder sb1 = new StringBuilder();//字符拼接

    }

}
