package com.it.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter的创建
 */
public class FileWriterDemo01 {
    public static void main(String[] args) throws IOException {
        //1.通过file类来进行创建
        File file = new File("b.txt");
        FileWriter fw = new FileWriter(file);
        //2.直接指定文件名称
        FileWriter fw1 = new FileWriter("b.txt");
    }
}
