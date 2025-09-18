package com.it.array;

import static java.lang.Integer.sum;

public class MethodDemo01 {
    public static void main(String[] args) {
        int[][] arr = {{22, 66, 44}, {77, 33, 38}, {25, 45, 65}, {11, 66, 99}};
        ArrayDemo05.countTotal(arr);
        //方法创建的组成
        //方法的修饰符（public static）+方法的返回值+方法名（方法的参数）{
        //方法执行的内容
        //return 返回（方法的返回值不是void） void代表当前方法是没有返回值
        //在定义方法的时候入轨方法的返回值不是void类型 就需要return进行数值的返回
        //}
        //在调用方法的时候，方法需要的参数曾作为实参
        //在定义方法中写的参数称作形参 形式上的值 没有具体的值
        int count = sum(5,6);
        System.out.println(count);

    }
    public static int sum(int m ,int n){
        return m+n;
    }
}
