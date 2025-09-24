package com.it.system;

/**
 * system 类
 */
public class SystemDemo01 {
    public static void main(String[] args) {
        //1.字符的打印
        System.out.println("12312");
        //2.currentTimeMillis  返回当前的时间  单位是毫秒值
        long l = System.currentTimeMillis();
        System.out.println(l);

        //3.exit  退出当前程序
        //System.exit(0);


        //包装类
        int a = 4;
        //int转Integer
        Integer it = new Integer(a);
        System.out.println(it);
        //Integer转int
        int i = it.intValue();
        System.out.println(i);


        //字符转Integer
        int i1 = Integer.parseInt("45");
        System.out.println(i1);


    }
}
