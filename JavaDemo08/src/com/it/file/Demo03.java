package com.it.file;

import java.io.File;

/**
 * file中相对路径和绝对路径
 */
public class Demo03 {
    public static void main(String[] args) {
        // D盘下的bbb.java文件
        File f = new File("D:\\aaa\\aaa.txt");
        System.out.println(f.getAbsolutePath());

        // 项目下的bbb.java文件
        File f2 = new File("JavaDemo08\\Main.java");
        System.out.println(f2.getAbsolutePath());
    }
}
