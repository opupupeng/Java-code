package com.demo;

/**
 * 关于java数据类型之间的转换
 */
public class Demo01 {
    public static void main(String[] args) {
        //数据类型转换分类:
        //1.自动转换(必须小类型的数据往大类型的数据转换会自动进行转换)
        //int byte short long float double char  boolean
        // byte --->short ----->char---->int -----long----float----double
        int c = 20;
        double d = c;
        System.out.println(d);
        //2.强制转换(大类型的数据往小类型的数据进行转换)
        //注意:强制转换如果是数值类型大类型数值往小类型进行转换的时候,会丢失数据的精度
        float a = 10.5f;
        int b  = (int)a;
        System.out.println(b);

        int e = 'a';
        System.out.println(e);
    }

}
