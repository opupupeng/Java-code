package com.it.demo;

import java.util.Random;
import java.util.Scanner;

public class RandomAndWhileDemon01 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("请输入你猜的数");
            int sum =sc.nextInt();
            if (sum>number){
                System.out.println("你猜大了");
            }else if (sum<number){
                System.out.println("你猜小了");
            }else {
                System.out.println("你猜对了");
                break;
            }
        }
    }
}
