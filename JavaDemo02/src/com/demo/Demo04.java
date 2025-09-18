package com.demo;

/**
 * 赋值运算符
 */
public class Demo04 {
    public static void main(String[] args) {
        //赋值运算符  =  += -=  /= *=
        //= 赋值
        int a = 10;
        //+=  在原有值上进行累加
        a+=a;
        System.out.println(a);
        //-= 在原有值上进行减
        //a-=a;
        //System.out.println(a);
        ///=  在原有值上进行相除
        a/=a;
        System.out.println(a);
        //*= 在原有值上进行相乘
        a*=a;
        System.out.println(a);
    }
}
