package com.it.exception;

/**
 * 自定义异常信息
 *      当程序运行的代码需要自己手动制定异常的时候 可以采用自定义的异常
 *      public class  类名  extends Exception  或者  RuntimeException{
 *          提供构造方法
 *      }
 *
 *      //实现的业务:
 *          根据用户输入的用户名 判断用户名是否存在  如果存在  就抛自定义的异常  用户名已经存在 注册失败的消息
 *          如果不存在 就提示注册成功
 */
public class ExceptionDemo03 {
    //已经有的用户名
    private static String[] names = {"bill","hill","jill"};
    public static void main(String[] args) {
        //定义比对用户名的方法
        try{
            //调用校验用户名的方法
            checkName("jill");
            System.out.println("注册成功!");
        }catch (RegisterException e){
            System.out.println(e.getMessage());
        }
    }
    //将用户注册的用户名和 names数组中的内容进行比较
    public static boolean checkName(String name) throws RegisterException{
        //1.循环names  判断用户名是否一样
        for (int i = 0; i < names.length; i++) {
            if(name.equals(names[i])){
                //抛自定义异常
                throw new RegisterException("用户名已经存在,请重新输入!");
            }
        }
        return true;
    }
}
