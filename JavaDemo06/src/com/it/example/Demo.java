package com.it.example;

/**
 * 进行代码的调用
 */
public class Demo {
    public static void main(String[] args) {
        PingpangPlayer pp = new PingpangPlayer();
        pp.setName("张三");
        pp.setAge(34);
        System.out.println(pp.getName());
        System.out.println(pp.getAge());
        pp.eat();
        pp.speakEnglish();
        pp.study();

        PingpangCoach pc = new PingpangCoach();
        pc.setName("刘备");
        pc.setAge(50);
        System.out.println(pc.getName());
        System.out.println(pc.getAge());
        pc.eat();
        pc.speakEnglish();
        pc.touch();

    }
}
