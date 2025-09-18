package com.it.array;

/**
 * 求公司年销售额的总和
 * 第一季度：22，66，44
 *          77，33，88
 *          25，45，65
 *          11，66，99
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] arr = {{22,66,44},{77,33,38},{25,45,65},{11,66,99}};
        countTotal(arr);

    }

    public static void countTotal(int[][] arr){
        int sum = 0;
        //循环每个季度的销售额
        for (int i = 0; i < arr.length; i++) {
            int jiduCount=0;
            for (int j = 0; j < arr[i].length; j++) {
                jiduCount+=arr[i][j];
            }
            System.out.println("第"+(i+1)+"季度的销售总额"+jiduCount+"万元");
            sum+=jiduCount;
        }
        System.out.println("某公司的季度销售额："+sum+"万元");
    }

}
