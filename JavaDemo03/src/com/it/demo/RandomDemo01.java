package com.it.demo;

import java.util.Random;

/**
 * 随机数的生成
 */
public class RandomDemo01 {
    public static void main(String[] args) {
        //随即类的创建
        Random random = new Random();
        int number =random.nextInt(20);
        System.out.println(number);
    }
}
