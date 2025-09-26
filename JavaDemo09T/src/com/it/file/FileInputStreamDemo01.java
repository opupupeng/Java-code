package com.it.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 输入流FileInputStream
 *       创建方式
 *       1.通过指定file类来进行创建
 *       2.通过指定文件名称来进行创建
 */

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //1.通过file类来进行创建
        //File file = new File("a.txt");
        //FileInputStream fis = new FileInputStream(file);
        //2.通过指定文件路径
        FileInputStream fis1 = new FileInputStream("a.txt");

        //1.读取文件中的内容  单个字符读取方式
        /*int read = fis1.read();
        System.out.println((char) read);
        int read1 = fis1.read();
        System.out.println((char) read1);
        int read2 = fis1.read();
        System.out.println((char) read2);
        int read3 = fis1.read();
        System.out.println((char) read3);
        int read4 = fis1.read();
        System.out.println((char) read4);

        int read5 = fis1.read();
        System.out.println(read5);*/
        //2.循环读取
        int b;
        while ((b =fis1.read())!=-1){
            System.out.println((char) b);
        }
        fis1.close();
    }
}
