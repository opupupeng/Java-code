package com.it.list;

import com.it.collection.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合
 *  也是collection下的一个子类，代表了集合的容器
 *  list中每个元素是有索引值的,底层是采用的数组格式  list中是允许有重复的元素   list中先设置的元素是存放在集合的最上面的
 */
public class ListDemo01 {
    public static void main(String[] args) {
        //1.集合的创建方式:  创建list集合   ;  指定集合元素的类型
        // List list = new ArrayList();
        List list = new ArrayList();
        //集合插入数据数据的方式  叫尾插法
        list.add("刘备");
        list.add("曹操");
        list.add("孙权");
        list.add(3,"曹丕");
        System.out.println(list.toString());

        //获取某一个元素   集合名称.get(元素索引)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        //移除某个元素
        System.out.println(list.remove(3));
        System.out.println(list.toString());

        //替换某个元素
        Object caorui = list.set(1, "曹睿");
        System.out.println(caorui.toString());
        System.out.println(list.toString());

        //List集合的遍历  for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //如果在list集合中设置了数据的泛型   增强for
        List<String> lists = new ArrayList<>();
        lists.add("蔡茂");
        lists.add("张允");

        for(String s:lists){
            System.out.println(s);
        }
    }
}
