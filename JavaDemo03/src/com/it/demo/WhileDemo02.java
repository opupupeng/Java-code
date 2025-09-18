package com.it.demo;

public class WhileDemo02 {
    //1.循环条件厚度<=8844430
    //2.纸的折叠厚度再次折叠都是厚度*2
    public static void main(String[] args) {
        //折叠次数
        int count = 0;
        //纸的厚度
        double paper =0.1;
        //高度
        int zf = 8844430;
        while (paper<=zf){
            paper*=2;
            count++;
        }
        System.out.println("需要折"+count+"次");
    }
}
