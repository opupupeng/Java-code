package com.it.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * fielReader  创建
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.通过file类来进行创建
        File file = new File("b.txt");
        FileReader fr = new FileReader(file);
        //2.直接指定文件名称
        FileReader fr1 = new FileReader("b.txt");
    }
}
