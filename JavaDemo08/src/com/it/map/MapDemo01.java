package com.it.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map集合：
 *  map是一个双列的集合,由key value 来组成   例如:单列集合   list.add(元素值(value))   双列集合:map.put(key,value)
 *  map中元素设置值的方式  是通过key  value来进行设置
 *  key代表当前元素唯一性  在设置值的时候 需要保证key的唯一   value值的类型:基础数据  引用类型  集合  对象
 */
public class MapDemo01 {
    public static void main(String[] args) {

        //1.map集合的创建
        Map<String,Integer> map = new HashMap<>();

        //2.添加map中的元素   添加学生的学号和分数
        map.put("0001",90);
        map.put("0002",89);
        map.put("0003",80);
        System.out.println(map.toString());
        Set<String> set = map.keySet();
        //3.map元素的删除  删除学生信息
        if(set.contains("0003")){
            map.remove("0003");
            System.out.println(map.toString());
        }else{
            System.out.println("没有找到学生对应的ID,请输入存在的ID!");
        }

        //4.获取map中的元素值
        Integer score = map.get("0002");
        System.out.println(score);
        //5.map所有元素值的获取

        System.out.println("ID    分数");
        for (String str:set ) {
            //获取值
            Integer scores = map.get(str);
            System.out.println(str+"    "+scores);
        }
    }
}
