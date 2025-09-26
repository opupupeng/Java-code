package com.it.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * linkedHashSet
 *  特点：在添加元素值的时候保证了 添加元素的顺序
 */
public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        //添加元素
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("大乔");
        lhs.add("小乔");
        lhs.add("貂蝉");
        lhs.add("孙小妹");

        Iterator iterator = lhs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
