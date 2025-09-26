package com.it.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("read.txt");
        FileInputStream fis = new FileInputStream("read.txt");
        int b ;
        while ((b=fis.read())!=-1){
            System.out.println((char)b);
        }
        fis.close();
    }
}
