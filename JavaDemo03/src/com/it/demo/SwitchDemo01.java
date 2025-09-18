package com.it.demo;

/**
 * switch 语句
 */
public class SwitchDemo01 {
public static  void main(String[] args){
    int a = 1;
    switch(a){
        case 1:
            System.out.println("星期一");
            break;
        case 2:
            System.out.println("星期二");
            break;
        case 3:
            System.out.println("星期三");
            break;
        case 4:
            System.out.println("星期四");
            break;
        case 5:
            System.out.println("星期五");
            break;
        case 6:
            System.out.println("星期六");
            break;
        case 7:
            System.out.println("星期天");
            break;
        default:
            System.out.println("无");

    }
    }
}
/**
 * switch语句 可以根据某个变量的值来选择相应的选项，根据变量值来进行匹配
 * switch（表达式）{ 表达式的值必须是一个常量表达式，不能是逻辑表达式
 *     case 匹配的值；
 *     具体输出的内容；
 *
 * }
 */