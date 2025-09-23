package com.it.example;

/**
 * 乒乓球运动员
 */

public class PingpangPlayer extends Player implements SpeakEnglish{
    @Override
    public void study() {
        System.out.println("学习乒乓球规则......");

    }

    @Override
    public void speakEnglish() {
        System.out.println("学习一会英语......");
    }

    @Override
    public void eat() {
        System.out.println("吃龙虾,喝台子......");
    }
}
