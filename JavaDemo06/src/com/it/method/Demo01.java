package com.it.method;

import com.it.example.Student;

/**
 * 方法的使用
 *   修饰符  static   返回值类型  方法名(参数列表){
 *       如果返回值类型不是void  需要通过return
 *       [return  返回值类型一样的值]
 *   }
 *   参数、返回值类型:基本数据类型、引用数据类型(数组、类或者对象)
 */
public class Demo01 {
    public static void main(String[] args) {
        //基本数据类型作为参数和返回值
        System.out.println(sum(10,20));

        //引用类型数据作为参数和返回值
        Student s = new Student();
        Student stu1 = printStudent(s);
        System.out.println(stu1);
        //抽象类作为方法的参数
        Animal a = new Cat();
        printCat(a);
        //接口作为方法的参数
        Jumping jumping = new JumpingImpl();
        printJump(jumping);
    }
    //基本数据类型作为参数和返回值
    public static int sum(int a,int b){
        return a+b;
    }
    //引用类型数据作为参数和返回值
    public static Student printStudent(Student s){
        s.setName("貂蝉");
        s.setAge(20);
        return s;
    }
    //抽象类作为方法的参数
    public static Animal printCat(Animal a){
        a.eat();
        return a;
    }
    //接口作为方法的参数
    public static  void printJump(Jumping jumping){
        jumping.jumping();
    }
}
