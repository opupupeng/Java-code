package com.it.method;

public class Dog {
    //定义静态变量
    public static String USERNAME="李四";
    public static int  AGE=20;
    //静态代码块
    //格式 static{}
    static {
        USERNAME = "华夫人";
        AGE = 40;
    }

}
