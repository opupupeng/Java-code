package com.it.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * collection集合元素的迭代(获取)Iterator
 * collection 集合知识点
 *  collection是一个存储不同数据的容器,可以规定相同数据类型 也可以不规定数据类型
 *  集合的创建:
 *      Collection collection = new 子类集合(ArrayList)
 *      在创建过程中可以指定集合存储数据的类型也可以不指定
 *      如果制定的集合存储数据的类型  元素获取 有两种方式:1.使用迭代器   2.使用增强for  具体格式 for(集合对应的数据类型 元素名称:集合名称)
 *      如果没有指定集合存储的数据类型  只能通过迭代器的方式来获取集合中的元素
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //2.如何往集合中设置元素
        collection.add("刘表");
        collection.add(12312);
        collection.add(new Student());
        collection.add("关羽");
        collection.add("张飞");
        collection.add("赵云");
        collection.add("黄忠");
        collection.add("马超");

        //获取集合中的元素
        Iterator iterator = collection.iterator();
        //通过while循环来进行获取
        while(iterator.hasNext()){//iterator.hasNext  判断是否有下一个元素
            //获取元素  通过迭代器中next方法
            Object obj = iterator.next();
            System.out.println(obj.toString());
        }
        //定义带类型的集合对象
        Collection<String> coll = new ArrayList<>();

        coll.add("关羽");
        coll.add("张飞");
        coll.add("赵云");
        coll.add("黄忠");
        coll.add("马超");
        //增强for    for(集合元素的类型 元素名:集合)    如果使用增强for 必须规定集合中存储的元素类型
        for(String str:coll){
            System.out.println(str);
        }
    }
}
