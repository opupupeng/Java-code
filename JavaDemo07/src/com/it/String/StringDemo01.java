package com.it.String;

/**
 * String中常见的方法
 */

public class StringDemo01 {
    public static void main(String[] args) {
        //1.字符串的比较  equals
        String str1 = "Abc";
        String str2 = "abc";

        //比较两个字符是否相等  如果要判断固定值和某个字符是否相等   "中国".equals()
        System.out.println(str1.equals(str2));

        //忽略大小写 进行比较
        System.out.println(str1.equalsIgnoreCase(str2));

        //2.因为字符串是由byte的数组组成的  所以是可以获取字符的长度就是字符的个数
        System.out.println(str1.length());

        //3.在字符后边进行拼接
        System.out.println(str1.concat(str2));


        //4.字符串的截取  subString  主要是通过获取字符的索引来进行字符的截取
        //如果在subString 只提供一个索引值或者就是一个参数,默认是截取当前索引往后的所有字符
        //如果在subString中 如果提供两个参数,默认获取从开始索引到结束索引的前一个索引(不包含结束的索引)
        String str3 = "我是中国人!";
        String str4 = str3.substring(2);
        System.out.println(str4);
        String str5 = str3.substring(1, 2);
        System.out.println(str5);

        //5.替换字符  replace 里面需要提供两个参数 1.代表要替换字符的内容   2.要替换的内容
        //replaceAll  替换字符有所有能够匹配到的字符
        String str6 = str3.replace("我", "大家");
        System.out.println(str6);

        //6.字符串的切分  针对字符中需要进行切分的内容将字符进行截取  返回的是一个字符数组
        String str7 = " 我是中国人,大家都是中国人! ";
        String[] split = str7.split("人");
        System.out.println(split.length);
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(str7.trim());
    }
}
