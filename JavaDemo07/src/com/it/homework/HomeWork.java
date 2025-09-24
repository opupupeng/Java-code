package com.it.homework;

import java.util.*;

/**
 * 假设有一个学生分数管理系统，每个学生有一个唯一的ID，以及对应的分数。请使用Java中的Map集合来存储和管理这些信息。要求实现以下功能：
 * 1.添加学生分数信息。
 * 2.删除学生分数信息。
 * 3.所有学生分数信息
 * 4.退出系统
 */

public class HomeWork {
    public static void main(String[] args) {
        Map map = new HashMap();
        Scanner sc = new Scanner(System.in);
        while(true){
            //输出基本信息
            System.out.println("**************************");
            System.out.println("1.添加学生分数信息");
            System.out.println("2.删除学生分数信息");
            System.out.println("3.所有学生分数信息");
            System.out.println("4.退出系统");
            System.out.println("**************************");
            //提示用户输入信息
            System.out.println("请选择菜单序号(1-4):");
            int menuNumber = sc.nextInt();
            //作为公共变量
            Set set = map.keySet();
            //选择分支
            switch (menuNumber){
                case 1:
                    System.out.println("请输入学生ID:");
                    String number = sc.next();
                    //判断map集合中是否包含学生id
                    if(set.contains(number)){
                        System.out.println("学生ID已经存在,请重新输入学生ID");
                        break;
                    }
                    System.out.println("请输入学生分数:");
                    int score = sc.nextInt();
                    //将输入信息存入到map中
                    map.put(number,score);
                    System.out.println("学生分数输入成功!");
                    break;
                case 2:
                    System.out.println("请输入要删除学生ID:");
                    String numberDel = sc.next();
                    //判断输入的key是否在map集合中
                    if(!set.contains(numberDel)){
                        System.out.println("学生ID不存在,请输入存在的学生ID！");
                        break;
                    }
                    //通过key移除map中的数据
                    map.remove(numberDel);
                    System.out.println("学生分数信息删除成功!");
                    break;
                case 3:
                    //获取集合中的每一个key和value  并打印成 key       value的格式
                    SortedMap sortedMap =  new TreeMap(map);
                    System.out.println("ID      分数");
                    Set<String> set1 = sortedMap.keySet();
                    for(String s:set1){
                        //获取对应的value
                        System.out.println(s+"      "+sortedMap.get(s));
                    }
                    break;
                case 4:
                    System.out.println("退出系统成功!");
                    System.exit(0);
                default:
                    System.out.println("请选择菜单中有的编号!");
            }
        }
    }
}
