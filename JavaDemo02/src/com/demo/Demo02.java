package com.demo;

/**
 * java中的运算符
 */
public class Demo02 {
    public static void main(String[] args) {
        /**
         * 运算符的分类
         * 1.算术运算符  + - *  /  %
         * 2.逻辑运算符  &  与  |或   &&逻辑与  ||逻辑或   !非
         * 3.赋值运算符  =  += -=  /= *=
         * 4.自增自减运算符  前缀++   后缀++   前缀--  后缀--
         * 5.关系运算符 > < >=  <= !=  ==
         * 6.三元运算符    逻辑判断的表达式 ? 值1:值2;
         * 逻辑判断的表达式 ? 值1:逻辑判断的表达式 ? 值2 : 值3;
         */
        //算术运算注意
        // / %
        int a = 3;
        int b  = 5;
        //三元运算符
        //如果a的值小于b,输出a的值,否者就输出b的值
        System.out.println(a<b?a:b);

        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

       /* System.out.println(b/a);
        //注意: / 如果两个数值的类型都是int类型  最终输出的结果也是int 类型
        // 求余 2  前提两个数值必须是整形
        System.out.println(b%a);*/

       /* //逻辑运算符
        int c = ++b;
        int d = ++a;

        System.out.println(c +d);

        //关系运算符中注意的点
        //如果比较的是两个数字 或者对象  会使用==
        //如果两个值为字符类型   如果是说使用的是==   会比较两个字符的地址值
        //关于字符之间的比较用的最多的是equels
        String abc = "中国";
        String bcd = "中国";

        System.out.println(abc == bcd);
        System.out.println(abc.equals(bcd));*/

    }
}
