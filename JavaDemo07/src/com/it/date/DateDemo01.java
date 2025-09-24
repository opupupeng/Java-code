package com.it.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date类
 */
public class DateDemo01 {
    public static void main(String[] args) throws ParseException {
        //1.date日期的创建
        Date date = new Date();
        System.out.println(date);

        //日期转换  可以对日期进行格式化:yyyy-MM-dd  HH:mm:ss
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sf.format(date);
        System.out.println(format);
        Date parse = sf.parse("2024-08-10 12:00:00");
        System.out.println(parse);
    }
}
