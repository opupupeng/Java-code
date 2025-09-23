package com.it.duotai;

/**
 * 多态的转型
 *      为什么要进行转型? 为了体现在代码引用的过程中能够更好进行代码的解耦合
 *      多态转型的类型:
 *          1.向上转型    父类类型  父类名称 = new 子类名称();(自动完成)
 *          2.向下转型    //为什么要向下转型,如果在访问方法的时候,父类调用子类的方法必须得向下转型
 *          条件:1.必须简历向上转型基础之上
 *          父类类型  父类名称 = new 子类名称();
 *          子类类型  子类名称 = (子类类型)父类名称;(强制转换)
 *          注意问题:如果出现多个不同子类在进行向下转型的时候，因为转型的固定的  所以进行强制转换的时候会出现
 *          转换异常的情况  ClassCastException
 *          解决问题:需要通过instanceof方法可以判断父类在调用的时候具体是哪种子类  比较运算符
 *          类  instanceof  类   返回的是boolean类型的值   true或者false
 */
public class Demo {
    public static void main(String[] args) {
        //多态
        Animal animal = new Cat();
        eatAnimal(animal);
        Animal animal1 = new Dog();
        eatAnimal(animal1);
    }
    //定义方法
    public static void eatAnimal(Animal animal){
        animal.eat();
        //如果要调用子类中独有的方法必须进行向下转型
       /* if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.speak();
        }

        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.dogSpeak();
        }*/
        Cat cat = (Cat) animal;
        cat.speak();


    }
}
