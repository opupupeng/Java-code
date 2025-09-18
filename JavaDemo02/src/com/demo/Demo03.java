package com.demo;

/**
 * 逻辑运算符
 */
public class Demo03 {
    public static void main(String[] args) {
        // 2.逻辑运算符  &  与  |或   &&逻辑与  ||逻辑或   !非
        //定义变量
        int i = 10;
        int j = 20;
        int k = 30;

        //逻辑与  和与的区别  与的如果表达式左边的值为false  右边的表达式就不在进行计算
        //逻辑与  不管符号两边是否为false 都会进行计算
        System.out.println((i > j) && (i > k)); //false & false,输出false
        System.out.println((i < j) && (i > k));

        //逻辑或
        System.out.println((i > j) || (i > k)); //false & false,输出false
        System.out.println((i < j) || (i > k));
        //逻辑或和或的区别   或 符号左边为true 右边的表达式就不在执行
        //逻辑或   无论两边值为多少  都会执行

        //& “与”，并且的关系，只要表达式中有一个值为false，结果即为false
        System.out.println((i > j) & (i > k)); //false & false,输出false
        System.out.println((i < j) & (i > k)); //true & false,输出false
        System.out.println((i > j) & (i < k)); //false & true,输出false
        System.out.println((i < j) & (i < k)); //true & true,输出true
        System.out.println("--------");

//| “或”，或者的关系，只要表达式中有一个值为true，结果即为true
        System.out.println((i > j) | (i > k)); //false | false,输出false
        System.out.println((i < j) | (i > k)); //true | false,输出true
        System.out.println((i > j) | (i < k)); //false | true,输出true
        System.out.println((i < j) | (i < k)); //true | true,输出true
        System.out.println("--------");

//^ “异或”，相同为false，不同为true
        System.out.println((i > j) ^ (i > k)); //false ^ false,输出false
        System.out.println((i < j) ^ (i > k)); //true ^ false,输出true
        System.out.println((i > j) ^ (i < k)); //false ^ true,输出true
        System.out.println((i < j) ^ (i < k)); //true ^ true,输出false
        System.out.println("--------");

//! “非”，取反
        System.out.println((i > j)); //false
        System.out.println(!(i > j)); //!false，,输出true
    }
}
