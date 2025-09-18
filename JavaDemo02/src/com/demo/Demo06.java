package com.demo;

import java.util.Scanner;

/**
 * 通过输入语句实现输入三个和尚的身高输出最大最高的和尚
 */
public class Demo06 {
    public static void main(String[] args) {
        //1.需要创建输入语句的对象
        Scanner sc  = new Scanner(System.in);
        //2.提示输入第一个和尚的身高
        System.out.println("请输入第一个和尚的身高,身高的单位为厘米:");
        //3.接收和尚的身高
        int first = sc.nextInt();
        //4.提示输入第二个和尚的身高
        System.out.println("请输入第二个和尚的身高,身高的单位为厘米:");
        //5.接收身高
        int second = sc.nextInt();
        //6.提示第三个和尚
        System.out.println("请输入第三个和尚的身高,身高的单位为厘米:");
        //7.接收身高
        int third = sc.nextInt();
        //8.通过三元运算符来判断身高的最大值
        int last1 = first>second?first:second;
        int last2 = third>last1?third:last1;
        //9.输出最大的值
        System.out.println("三个和尚中最高的身高为:"+last2+"厘米");
    }
}
