package com.it.file;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

/**
 * file创建文件和目录
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        //1.创建一个file类  使用相对路径
        File file = new File("bbb.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());

        String path = "newDir";
        file = new File(path);
        System.out.println(file.exists());
        file.mkdir();
        System.out.println(file.exists());

    }
}
