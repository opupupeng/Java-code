package com.it.demo;

import java.util.Random;

/**
 * 获取十个随机数
 */
public class RandomDemo02 {
    public static void main(String[] args) {
        //需求：获取十个随机数
        //通过循环来进行获取，如果不使用循环只能获取一个数
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
         int number =random.nextInt(10);
         System.out.println(number);
        }
    }
}
