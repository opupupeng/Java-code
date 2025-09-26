package com.it.file;

import java.io.File;

/**
 * file目录的遍历
 */
public class Demo05 {
    public static void main(String[] args) {
        File file = new File("D:\\jdk11");

        //1.遍历目录 获取文件的集合
        String[] lists = file.list();
        for (String str: lists){
            System.out.println(str);
        }
        //2.获取files的数组
        File[] files = file.listFiles();
        for (File file1 :files){
            System.out.println(file1);
        }
    }
}
