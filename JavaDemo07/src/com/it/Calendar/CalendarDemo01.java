package com.it.Calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 日历类
 */
public class CalendarDemo01 {
    public static void main(String[] args) {
        //1.calendar的创建
        Calendar calendar = Calendar.getInstance();

        //获取时间
        Date time = calendar.getTime();
        System.out.println(time);

        int weekYear = calendar.getWeekYear();
        System.out.println(weekYear);
        TimeZone timeZone = calendar.getTimeZone();
        System.out.println(timeZone);

        //年 月日
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int month = calendar.get(Calendar.MONTH)+1;
        System.out.println(month);
        int date = calendar.get(Calendar.DATE);
        System.out.println(date);
    }
}
