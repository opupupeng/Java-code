package com.it.list;

import java.util.LinkedList;

/**
 * linkedList集合
 *      为了解决arrayList在添加或者删除数据的时候效率较慢
 *      创建格式
 *      LinkedList  list = new LinkedList();
 */
public class LinkedListDemo01 {
    public static void main(String[] args) {
        //1.集合的创建
        LinkedList list = new LinkedList();

        //2.设置集合元素
        list.add("关羽");
        list.addFirst("张飞");
        System.out.println(list.toString());
        list.add("张苞");
        System.out.println(list.toString());

        System.out.println(list.getFirst());
    }
}
