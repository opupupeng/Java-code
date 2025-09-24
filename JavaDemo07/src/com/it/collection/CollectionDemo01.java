package com.it.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合中的数据
 * 主要分成了单列集合和双列集合
 */
public class CollectionDemo01 {

    public static void main(String[] args) {
        //1.创建集合  如果是collection 需要通过多态 进行创建
        Collection collection = new ArrayList();
        //2.如何往集合中设置元素
        collection.add("刘表");
        collection.add(12312);
        collection.add(new Student());

        System.out.println(collection.toString());
        //3.将对应元素从集合中移除掉
        collection.remove("刘表");
        System.out.println(collection.toString());
        //4.判断集合中是否包含某个元素
        collection.add("蔡氏");
        collection.add("刘氏");

        System.out.println(collection.contains("刘氏"));
        //判断集合是否为空  适用于后期项目代码中的集合非空判断
        System.out.println(!collection.isEmpty());

        //集合中的元素是指的个数   通过size来获取集合元素个数
        System.out.println(collection.size());
    }

}
