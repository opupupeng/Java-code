package com.it.array;

import java.sql.SQLOutput;

/**
 * 使用方法的形式实现数组最大值
 */
public class MethodDemo04 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {12,34,5,67,89};
        //2.调用方法返回最大值
        int value =findMaxValue(arr);
        //3.输出最大值
        System.out.println("数组中最大的值为："+value);
    }
    private static int findMaxValue(int[] arr){
        //实现获取数组的最大值
        int temp=arr[0];
        //通过循环比较数组中的值
        for(int i = 0; i< arr.length;i++){
            if(temp<arr[i]){
                temp = arr[i];
            }
        }
        //返回
        return temp;
    }
}
