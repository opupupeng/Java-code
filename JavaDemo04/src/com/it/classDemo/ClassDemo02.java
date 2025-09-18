package com.it.classDemo;

import com.it.entity.Phone;

/**
 * 调用手机类中的属性和方法
 */
public class ClassDemo02 {
    public static void main(String[] args) {
        //1.创建手机对象
        Phone phone = new Phone();
        phone.brand="华为p100";
        phone.color="屎黄金";
        phone.price=300000;
        System.out.println("我有一个新手机"+phone.brand);
        System.out.println("颜色"+phone.color);
        System.out.println("价格"+phone.price);
        phone.call("九连环");
        phone.SendMessage();
    }
}
