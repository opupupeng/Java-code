package com.it.String;

/**
 * 完成字符的拼接
 */
public class StringDemo02 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1,2,3,4};
        //2.初始化的字符
        String str = "[";
        //遍历数组中的元素
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str=str.concat(arr[i]+"]");
            }else{
                str=str.concat(arr[i]+",");
            }
        }
        //打印拼接后的字符
        System.out.println(str);
    }
}
