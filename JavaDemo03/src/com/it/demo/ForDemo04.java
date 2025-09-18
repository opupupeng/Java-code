package com.it.demo;

/**
 * 输出100-999之间的水仙花数
 */
public class ForDemo04 {
    public static void main(String[] args) {
        for (int i=100;i<=999;i++){
            int ge = i%10;
            int shi =i/10%10;
            int bai =i/10/10%10;

            if (i==(bai*bai*bai+shi*shi*shi+ge*ge*ge)){
                    System.out.println(i);
            }
        }
    }
}
