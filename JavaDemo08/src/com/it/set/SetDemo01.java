package com.it.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set集合的使用:
 *      1.集合的创建   Set<数据类型>  set = new HashSet();
 *      2.集合元素的操作   添加元素  add
 *      3.集合数据的遍历   增强for
 */

public class SetDemo01 {
    public static void main(String[] args) {
        //1.set集合的创建
        Set<String> set = new HashSet<>();

        //2.对集合中的元素进行操作
        //添加元素
        set.add("大乔");
        set.add("小乔");
        set.add("貂蝉");
        set.add("孙小妹");
        set.add("貂蝉");
        System.out.println(set.toString());
        //移除元素
        //set.remove("貂蝉");
        //System.out.println(set.toString());

        //set元素的获取
        //1.增强for
        for (String str:set) {
            System.out.println(str);
        }
        //2.迭代器的方式
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
