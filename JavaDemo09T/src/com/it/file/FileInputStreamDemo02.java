package com.it.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * FileInputStream 读取文件中的内容 通过字节数组
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        //1.创建输入流
        FileInputStream fis = new FileInputStream("b.txt");
        //创建一个变量  作为读取的结束条件
        int len;
        //创建一个字节数组
        byte[] bytes = new byte[3];
        //循环读取文件中的内容
        while((len=fis.read(bytes))!=-1){
            //System.out.println(new String(bytes));
            //如果字节长度为单数 没办法拼接后续的字符
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
