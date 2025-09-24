package com.it.math;

/**
 * Math 主要进行数学的计算
 */
public class MathDemo01 {
    public static void main(String[] args) {
        //圆周率
        System.out.println(Math.PI);
        //取绝对值
        double abs = Math.abs(4.5);
        System.out.println(abs);
        //向上取整
        double ceil = Math.ceil(4.5);
        System.out.println(ceil);
        double floor = Math.floor(4.5);
        System.out.println(floor);

        //最大值
        int max = Math.max(4, 7);
        System.out.println(max);

        //随机数
        double random = Math.random();
        System.out.println(random);
    }
}
