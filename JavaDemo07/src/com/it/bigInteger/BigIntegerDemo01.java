package com.it.bigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * BigInteger   主要解决如果数字超过long类型的范围的时候需要使用
 *
 */
public class BigIntegerDemo01 {
    public static void main(String[] args) {
        //1.BigInteger 创建
        BigInteger bt1 = new BigInteger("34454");
        BigInteger bt2 = new BigInteger("31321");

        //加法
        System.out.println("加法:"+bt1.add(bt2));
        //减法
        System.out.println("减法:"+bt1.subtract(bt2));
        //乘法
        System.out.println("乘法:"+bt1.multiply(bt2));
        //除法
        System.out.println("除法:"+bt1.divide(bt2));

        BigDecimal bd = new BigDecimal("0.2356");
    }
}
