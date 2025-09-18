package com.it.demo;

/**
 * 计算1-100的偶数和
 */
public class ForDemo03 {
    public static void main(String[] args) {
        int count = 0;
        //1.需要循环1-100之间的数
        for (int i=1;i<=100;i++){
            //2.要挑出1-100之间的偶数 i%2==0
            //3.计算偶数和 需要在循环的外部定义一个用来存储偶数的变量 count+=i； count=count+1
            if(i%2==0){
                count+=i;
            }
        }

        System.out.println(count);
    }


}
