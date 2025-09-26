package com.it.file;

import com.it.entity.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 对象反序列化流 输入流 ObjectInputStream
 */
public class ObjectInputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        //1.创建
        //通过字节输入流来进行创建
        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //2.通过对象的形式 读取文件中的内容,将文件中对象信息进行返回
        Student s = (Student) ois.readObject();

        ois.close();
        fis.close();

        //打印读取的信息
        System.out.println("姓名:"+s.getName());
        System.out.println("年龄:"+s.getAge());
        System.out.println("地址:"+s.getAddress());
    }
}
