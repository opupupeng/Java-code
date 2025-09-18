package com.it.demo;

/**
 * 嵌套循环
 */
public class ForDemo05 {
    /*
    需求：要求使用for循环完成小时分的输出
     */
    //1.一天有24小时 一小时有60分钟 要求把 每一个小时每一分钟都进行输出
    public static void main(String[] args) {
        //外层循环 循环小时
        for (int i = 0; i < 24; i++) {
            //内层循环 循环分钟
            for(int j=0;j<60;j++){
                System.out.println(i+":"+j);
            }

        }

    }
}
