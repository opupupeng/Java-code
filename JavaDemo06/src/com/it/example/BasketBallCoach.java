package com.it.example;

/**
 * 篮球教练
 */
public class BasketBallCoach extends Coach{
    @Override
    public void touch() {
        System.out.println("教怎么运球......");
    }

    @Override
    public void eat() {
        System.out.println("吃馒头,喝稀饭..........");
    }
}
