package com.it.array;

/**
 * 求出数组中的最大值或者最小值
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //1.创建一个数组
        int[] arr ={5,100,15,2000,4000};
        //指定一个变量，用来进行元素位置的交换
        int temp = arr[0];
        //循环数组
        for (int i = 0; i < arr.length; i++) {
            if (temp<arr[i]){
                temp = arr[i];
            }
        }
        System.out.println("最大值为"+temp);
    }
}
