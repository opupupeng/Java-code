package com.it.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException{
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);

        FileInputStream fis = new FileInputStream("b.txt");
    }
}
