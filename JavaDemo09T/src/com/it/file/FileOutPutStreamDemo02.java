package com.it.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutPutStream文件写入方式
 * 1.写入单个字节
 * 2.写入字节数组
 * 3.可以规定写入字节数组的长度
 */
public class FileOutPutStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //1.写入单个字节
        FileOutputStream fos = new FileOutputStream("a.txt",true);
        //调用写入方法
        fos.write(97);
        fos.write(100);
        fos.write(110);
        fos.write(10000);
        //换行操作
        fos.write("\r\n".getBytes());

        //2.写入字节数组
        byte[] bytes = "我爱学习,爱Java!".getBytes();
        fos.write(bytes);
        //换行操作
        fos.write("\r\n".getBytes());
        //3.通过写入字节数组 指定长度   write(字节数组,从数组哪个开始,写入几个字节)
        byte[] bytes1 = "abcdefg".getBytes();
        fos.write(bytes,2,2);
        //资源关闭
        fos.close();
    }
}
