package com.it.classDemo;

import com.it.entity.Person;

public class ClassDemo03 {
    public static void main(String[] args) {
        Person person =new Person("九连环",20,220,110);
        //获取对象中私有化的属性，因为属性已经被私有化，所以不能直接调用
        person.setName("九连环");
        person.setAge(20);
        person.setHeight(220);
        person.setWeight(110);
        String name = person.getName();
        int age = person.getAge();
        double height = person.getHeight();
        double weight = person.getWeight();


        System.out.println(person);
        System.out.println("姓名"+name);
        System.out.println("年龄"+age);
        System.out.println("身高"+height);
        System.out.println("体重"+weight);
    }
}
