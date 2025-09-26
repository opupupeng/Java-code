package com.it.file;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * FileReader读取文件
 */
public class FileReaderDemo02 {

    public static void main(String[] args) throws Exception {
        //1.单个字符的读取
        FileReader fr = new FileReader("b.txt");
        //循环读取的方式
        int len;
        //循环读取文件中的内容
       /* while((len=fr.read())!=-1){
            System.out.println((char)len);
        }*/
        //2.字符数组读取
        //先定义字符数组
        char[] ch = new char[2];
        while((len=fr.read(ch))!=-1){
            System.out.println(new String(ch));
        }
        //关闭资源
        fr.close();
    }
}
