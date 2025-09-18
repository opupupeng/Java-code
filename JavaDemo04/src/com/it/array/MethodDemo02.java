package com.it.array;

public class MethodDemo02 {
    public static void main(String[] args) {
        //打印十次helloworld
        printhelloworld(4, 5);
    }

    public static void  printhelloworld() {
        for (int i = 0; i < 10; i++) {
            System.out.println("helloworld");
        }
    }

    public static void printhelloworld(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("helloworld");
        }
    }

    public static int printhelloworld(int n,int m) {
       return m+n;
    }
}
