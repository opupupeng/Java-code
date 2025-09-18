package com.demo;

import java.util.Scanner;

/**
 * java中输入语句
 */
public class Demo05 {
    public static void main(String[] args) {
        //1.创建一个输入类Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要输出的整数:");
        //2.指定接收数据的类型
        int a = sc.nextInt();
        //3.打印在控制台中
        System.out.println("你输入的整数为:"+a);
    }
}
