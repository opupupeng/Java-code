package com.it.array;

import java.util.Objects;

/**
 * 数组元素的获取
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //数组元素的获取主要是通过数组的下标或者索引来获取
        int[] arr = {1,2,3,4,5};
        //数组的下标或者索引是从0开始
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        //超过索引的值
        //System.out.println(arr[5]);
        //数组长度为5 索引从0-4

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //空指的异常
        int[] arr1 = null;
        if (Objects.isNull(arr1)){
            System.out.println("当前数组为空 不能进行数组调动");
        }
        System.out.println(arr1[0]);

    }
}
