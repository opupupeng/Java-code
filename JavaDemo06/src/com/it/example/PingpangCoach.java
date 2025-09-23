package com.it.example;

/**
 * 乒乓球教练
 */
public class PingpangCoach extends Coach implements SpeakEnglish{
    @Override
    public void eat() {
        System.out.println("吃白菜,喝大米粥.......");
    }

    @Override
    public void speakEnglish() {
        System.out.println("也学习英语.....");
    }

    @Override
    public void touch() {
        System.out.println("教怎么抽球......");
    }
}
