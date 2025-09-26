package com.it.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        byte[]b = "超级春丹".getBytes();
        fos.write(b);
        fos.close();
    }
}
