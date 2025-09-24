package com.it.String;

/***
 * String可变字符的使用
 */
public class StringDemo03 {
    //1.stringBuffer  都是字符中可变字符的容器  区别的在于 stringBuffer 是线程安全
    //2.StringBuilder
    public static void main(String[] args) {
        //1.append方法  在字符后进行拼接
        StringBuffer sf = new StringBuffer("新三国!");
        sf.append("非常好看!");

        System.out.println(sf);

        //StringBudiler
        StringBuilder sbd = new StringBuilder("曹操的几个儿子");
        sbd.append(",曹植,曹丕,曹冲,曹彰");
        System.out.println(sbd);
        //2.reverse  字符的反转
        sbd.reverse();
        System.out.println(sbd);
        String s = sbd.toString();
        System.out.println(s);
    }
}
