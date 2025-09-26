package com.it.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        byte[]b = "九连环大唐但".getBytes();
        fos.write(b);
        fos.close();
    }
}
