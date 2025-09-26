package com.it.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 文件输出流的创建  FileOutPutStream
 *  //创建方式:
 *      1.可以通过指定file文件来创建
 *      2.可以直接直接文件名来进行创建
 */

public class FileOutPutStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.通过file类来进行文件的创建
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);

        //2.直接指定文件名称
        FileOutputStream fos1 = new FileOutputStream("b.txt");

    }
}
