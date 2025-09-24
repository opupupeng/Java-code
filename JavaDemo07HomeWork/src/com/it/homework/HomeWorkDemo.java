package com.it.homework;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWorkDemo {
    public static void main(String[] args) {
        //定义map集合 用来储存学生信息
        Map<String,Integer> map = new HashMap<>();
        //2.定义输入语句
        Scanner sc = new Scanner(System.in );
        //3.代码主体的操作
        while(true){
            //构建菜单内容
            System.out.println("*********************");
            System.out.println("1.添加学生分数信息");
            System.out.println("2.删除学生分数信息");
            System.out.println("3.查看所有学生分数信息");
            System.out.println("4.退出系统");
            System.out.println("*********************");
            //根据用户输入的序号来执行哪个功能
            System.out.println("请输入要操作的功能序号1-4：");
            //需要根据用户输入的序号来执行switch
            int menuNumber =sc.nextInt();
            Set<String> Ids = map.keySet();
            switch (menuNumber){
                case 1:
                    System.out.println("请输入学生的id");
                    String id = sc.next();
                    System.out.println("请输入学生的分数：");
                    int score = sc.nextInt();
                    map.put(id,score);
                    System.out.println("学生分数录入成功");
                    break;
                case 2:
                    System.out.println("请输入学生的id：");
                    String ids = sc.next();
                    if(Ids.contains(ids)){
                        System.out.println("没有找到对应的学生id，请重新输入");
                    }else {
                        map.remove(ids);
                        System.out.println("学生信息删除成功");
                    }
                    break;
                case 3:
                    System.out.println("Id     分数");
                    for(String str:Ids){
                        Integer sco =map.get(str);
                        System.out.println(str+"      "+sco);
                    }
                    break;
                case 4:
                    System.out.println("退出系统成功");
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入对应的菜单序号");
            }
        }
    }
}
