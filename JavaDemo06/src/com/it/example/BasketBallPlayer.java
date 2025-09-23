package com.it.example;

/**
 * 篮球运动员
 */
public class BasketBallPlayer extends Player{
    @Override
    public void eat() {
        System.out.println("吃牛肉,喝牛奶.......");
    }

    @Override
    public void study() {
        System.out.println("学习运球.......");
    }
}
