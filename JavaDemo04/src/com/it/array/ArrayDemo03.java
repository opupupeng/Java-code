package com.it.array;

/**
 * 数组位置的反转
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        //临时变量
        int temp =0;
        //循环
        for (int min = 0, max=arr.length-1; min<=max;min++,max--) {
            temp =arr[min];
            arr[min] =arr[max];
            arr[max]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
