package com.it.method;

/**
 * static 关键字   static修改变量   不同类之间可以通过类名之间方法   如果是在一个类中访问  类名.变量名访问
 * static  方法的时候   在一个类中之间进行访问   在不同类中  可以通过类型.方法名
 *  static修饰变量  如果变量是被static修饰的  在方法访问中,如果是普通方法  可以访问变量,如果是静态方法就访问不了变量
 * static 静态代码块     主要放在类开始的问题  在类创建的时候就去运行  只能运行一次
 */
public class Demo04 {
    public static int a = 20;
    public static void main(String[] args) {
        System.out.println(a);
        //调用对象中的属性
        System.out.println(Dog.USERNAME);
        System.out.println(Dog.AGE);
    }
    public static   void testStatic(){
        System.out.println(a);
        print();
    }
    public static   void print(){

    }
}
