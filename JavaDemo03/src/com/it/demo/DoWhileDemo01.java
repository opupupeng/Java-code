package com.it.demo;

/**
 * do while的使用
 */
public class DoWhileDemo01 {
    /*
    do{
    输出的内容
    }while(判断的条件);
     */
    public static void main(String[] args) {
        int i =1;
        do {
            System.out.println("HelloWorld");
            i++;
        }while (i<=5);
        //while条件不满足一次都不执行 do while会执行一次
    }
}
