package com.demo;

/**
 * 分支结构if语句
 */
public class Demo08 {
    /**
     * 分支结构的分类
     * 1.单分支   if(关系表达式){}
     * 2.双分支    if(关系表达式){}else{}
     * 3.多分支   if(关系表达式){}else if(){}else if{}else{}
     */
    public static void main(String[] args) {
       /* //1.判断两个值是否相等
        int a =30;
        int b = 30;
        if(a == b){
            System.out.println(true);
        }
        if(a==b){
            System.out.println(false);
        }
        //2.判断两个值的大小,输出最大的值
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }*/
        //3.将班级的学生成绩进行等级的划分,90-100 输出优秀 80-89 输出良好  60-79 输出中等  60以下输出不及格
        int score = 55;
        if(score>=90&&score<=100){
            System.out.println("优秀");
        }else if(score>=80&&score<=89){
            System.out.println("良好");
        }else if(score>=60&&score<=79){
        System.out.println("中等");
        }else {
            System.out.println("不及格!");
        }
    }
}
