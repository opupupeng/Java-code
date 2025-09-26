package com.it.file;

import java.io.File;

/**
 * file类中常见的方法
 */
public class Demo02 {
    public static void main(String[] args) {
        String path = "D://aaa";
        File file = new File(path);
        //调用file中的方法
        //获取文件的绝对路径
        String absolutePath = file.getAbsolutePath();
        System.out.println("绝对路径:"+absolutePath);
        //文件路径
        String path1 = file.getPath();
        System.out.println("路径:"+path1);
        //文件名称
        String name = file.getName();
        System.out.println("文件名:"+name);
        //文件长度
        long length = file.length();
        System.out.println("文件大小:"+length);

        //判断当前的文件或者目录是否存在

        System.out.println(file.exists());

        //判断是否为目录
        System.out.println(file.isDirectory());
    }
}
