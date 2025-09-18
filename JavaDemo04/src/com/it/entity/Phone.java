package com.it.entity;

/**
 * 手机类
 */
public class Phone {
    //品牌
    public String brand;
    public double price;
    public String color;

    public void call(String name){
        System.out.println("正在给"+name+"打电话.....");
    }
    public void SendMessage(){
        System.out.println("正在发送短信......");
    }
}
