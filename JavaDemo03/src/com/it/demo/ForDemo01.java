package com.it.demo;

/**
 * for循环
 */
public class ForDemo01 {
    //输入一百次的HelloWorld
    //1.输出的内容
    //2.初始的循环值
    //3.结束的条件
    //4.需要每次执行程序之后对当前输出的内容进行记录作为结束循环的条件
    public static void main(String[] args) {
        /*for (int i = 1;需要满足的条件i<=100；对初始值就进行累加i++){
        具体输出的内容
        }
         */
        for (int i = 1;i<=100;i++){
            System.out.println( "这是第"+i+"次的"+"HelloWorld");
        }
    }
}
