package com.it.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * LinkedHashMap 特点:保证元素插入的顺序
 */
public class LinkedHashMapDemo01 {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("邓超","孙俪");
        linkedHashMap.put("李晨","范冰冰");
        linkedHashMap.put("刘德华","朱丽倩");

        Set<Map.Entry<String, String>> set = linkedHashMap.entrySet();
        for (Map.Entry<String, String> entry:set){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

    }
}
