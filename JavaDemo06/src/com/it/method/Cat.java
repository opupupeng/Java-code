package com.it.method;

public class Cat extends Animal{

    String name;
    int age;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
