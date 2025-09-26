package com.it.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("a.txt");
        new FileOutputStream(file);
        FileOutputStream fos =new FileOutputStream("b.txt");
    }
}
