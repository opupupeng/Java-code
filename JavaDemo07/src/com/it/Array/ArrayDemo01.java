package com.it.Array;

import java.util.Arrays;

/**
 * Arrays主要是针对数组进行的操作
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //1.toString  将数组以字符的形式进行输出
        int[] arr = {3,4,5,67,1,23,45};
        System.out.println(Arrays.toString(arr));

        //2.sort 将数组中的数据进行升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
