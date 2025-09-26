package com.it.file;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter的使用
 */
public class FileWriterDemo02 {
    public static void main(String[] args) throws IOException {
        //创建
        FileWriter fw = new FileWriter("b.txt",true);
        //单个字符的写入
        //fw.write(97); // 写出第1个字符
        //fw.write('b'); // 写出第2个字符
        //fw.write('C'); // 写出第3个字符
        //fw.write(30000); // 写出第4个字符，中文编码表中30000对应一个汉字。

        //字符的数组
        char[] ch = "Hello world!".toCharArray();
        fw.write(ch);
        //通过指定字符的长度来写入
        fw.write("\r\n");
        fw.write(ch,0,3);
        fw.close();
    }
}
