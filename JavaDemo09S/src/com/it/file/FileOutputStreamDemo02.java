package com.it.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
