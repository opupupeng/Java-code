package com.it.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 图片复制的案例
 */
public class FileStreamDemo03 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            //1.创建输入流和输出流
            fis  = new FileInputStream("abc.jpg");
            fos = new FileOutputStream("abc-copy.jpg");
            //2.循环读取文件中的内容
            byte[] b = new byte[1024];
            //每次读取的len
            int len;

            //循环读取文件中的内容 并写入到副本文件中
            while((len=fis.read(b))!=-1){
                //输出流写文件
                fos.write(b,0,len);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            fis.close();
            fos.close();
        }

    }
}
