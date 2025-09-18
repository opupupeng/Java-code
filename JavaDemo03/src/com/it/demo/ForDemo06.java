package com.it.demo;

public class ForDemo06 {
    public static void main(String[] args) {
        //外层循环需要循环1-9
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"x"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
