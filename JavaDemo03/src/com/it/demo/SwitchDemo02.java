package com.it.demo;

import java.net.SocketOption;
import java.util.Scanner;

/**
 * 通过switch语句实现根据用户输入的数字输出对应的季节，用户必须输入1-12直接的数字
 */
public class SwitchDemo02 {
    //比如用户输入的数字是1 显示 春季对应的数字1-3 夏季对应4-6 秋季对应7-9 冬季对应10-12
    public static void main(String[] args) {
        //1.创建输入语句中的输入类
        Scanner sc = new Scanner(System.in);
        //2.提示用户输入对应的月份
        System.out.println("请输入要选择的月份");
        int month =sc.nextInt();
        switch(month) {
            case 1:
            case 2:
            case 3:
                System.out.println("你输入的月份对应季节为春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("你输入的月份对应季节为夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("你输入的月份对应季节为秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("你输入的月份对应季节为冬季");
                break;
            default:
                System.out.println("无");

        }
    }
}
