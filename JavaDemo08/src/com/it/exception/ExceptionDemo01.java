package com.it.exception;

/**
 * 异常的处理方式
 *   两种：
 *      1.积极的处理方式  主要采用try{}catch(){}  catch(主要编写要处理的异常信息)
 *      try{
 *          要出异常的代码
 *          //注意在catch参数中,如果只是写的单个异常的信息  程序只能捕获到异常信息,
 *          //因为不确定代码是否会出现其他的异常  所以在catch中一般都写大范围的异常类
 *          //主要是Exception这个类 来进行异常信息的捕获
 *      }catch(){
 *          //逻辑的处理
 *          //里面还包含一个finally的关键字
 *          //无论try catch是否捕获异常  都会执行finally中的内容
 *          //连接数据库    关闭数据库
 *      }finally{
 *          //释放数据库连接的资源
 *      }
 *      2.消极处理方式
 *
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        //数组索引越界的异常
        int[] arr = {1,2,3,4};
        //异常的编写  索引越界的异常
        try{
            //System.out.println(arr[4]);
            int a = 10;
            System.out.println(a);
            //System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("我自己能够积极处理异常信息,不需要靠别人");
        }finally {
            System.out.println("我最后执行!");
        }

    }
}
