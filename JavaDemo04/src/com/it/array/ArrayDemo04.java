package com.it.array;

/**
 * 二维数组的基本知识
 */
public class ArrayDemo04 {
    /**
     * 二维数组：
     *      由多个一维数组组成的数组称作为二维数组
     *      定义格式；
     *      1.int[][] arr   2.int arr[][]
     *      创建：
     *      1.int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};    2.int[][] arr = new int[3][3]
     *      值得初始化；
     *      int[][] arr = {{1,2,3},{4,5,6},{7,8,9}}
     *      int[][] arr = new int[2][2];
     *      arr[0][0]=1
     *      arr[0][1]=2
     *      arr[1][0]=3
     *      arr[1][1]=4
     */
    public static void main(String[] args) {
        //获取二维数组的元素
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //1.获取单个数组的元素
        System.out.println(arr[0][1]);
        System.out.println(arr[1][2]);
        //2.获取数组中所有的元素  嵌套的for循环 外部的循环 是循环二维数组中有几个一维数组  arr.length
        //内部的循环是获取一维数组中的元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");

            }

        }
    }
}
