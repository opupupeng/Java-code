package com.it.file;

import java.io.File;
import java.io.IOException;

/**
 * file类实例的创建
 */
public class Demo01 {

    public static void main(String[] args) throws IOException {
        //1.通过文件的路径加文件名称来进行创建
        String pathName1 = "D:/aaa.txt";
        File file1 = new File(pathName1);

        //2.通过文件路径加文件名称
        String pathName2 = "D://aaa/aaa.txt";
        File file2 = new File(pathName2);

        //3.通过 父路径 加子路径来创建
        String parent = "D://aaa";
        String child = "aaa.txt";
        File file3 = new File(parent,child);

        //4.通过file类 和子文件名称来进行创建
        File file4 = new File("D://aaa");
        String childPath="aaa.txt";
        File file5 = new File(file4,childPath);
    }
}
