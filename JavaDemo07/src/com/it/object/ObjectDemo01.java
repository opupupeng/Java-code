package com.it.object;

/**
 * 对象类
 */
public class ObjectDemo01 {
    public static void main(String[] args) {
        //演示对象中toString方法
        Person person = new Person();
        person.setName("孙权");
        person.setAge(20);

        String username = "孙策";

        if(!username.equals(person.getName())){
            System.out.println("equals的比较");
        }

        System.out.println(person);


    }
}
