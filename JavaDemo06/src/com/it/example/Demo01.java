package com.it.example;

import com.it.method.Demo04;

/**
 * 不同包访问静态变量或者方法
 */
public class Demo01 {
    public static void main(String[] args) {
        //静态变量
        System.out.println(Demo04.a);
        //静态方法
        Demo04.testStatic();
    }
}
