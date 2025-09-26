package com.it.file;

import com.it.entity.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化对象类ObjectOutPutStream
 * 注意:1.对象输出序列化流写入文件的内容是二进制的数据,不是给咱们看的 而是给电脑的
 *      2.往文件中写入的对象 必须实现序列化接口Serializable
 */
public class ObjectOutPutStreamDemo01 {
    public static void main(String[] args) throws Exception {
        //创建
        //1.先创建一个字节输出流
        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //2.需要调用writeObject方法才能写入到文件中  参数需要提供给一个实体类
        //创建学生对象
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(20);
        s.setAddress("xinxiang");

        //写入文件中
        oos.writeObject(s);

        oos.close();
        fos.close();
    }
}
