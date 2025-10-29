package com.it.controller;

import com.it.dao.FoodDao;
import com.it.dao.impl.FoodDaoImpl;
import com.it.entity.Food;

import java.sql.SQLException;
import java.util.*;


public class HomeWork {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        //创建菜品接口
        FoodDao foodDao = new FoodDaoImpl();
        while(true){
            //输出基本信息
            System.out.println("**********欢迎来到颐养中心管理系统************");
            System.out.println("1.菜品管理");
            System.out.println("2.用户管理");
            System.out.println("3.床位管理");
            System.out.println("4.客户管理");
            System.out.println("5.退出系统");
            System.out.println("******************************************");
            //提示用户输入信息
            System.out.println("请选择菜单序号(1-5):");
            int menuNumber = sc.nextInt();
            //选择分支
            switch (menuNumber){
                case 1:
                    Boolean foodFlag = true;
                    while(foodFlag){
                        System.out.println("**********欢迎来到颐养中心菜品管理模块************");
                        System.out.println("1.添加菜品");
                        System.out.println("2.修改菜品");
                        System.out.println("3.删除菜品");
                        System.out.println("4.查询菜品");
                        System.out.println("5.返回上一级菜单");
                        System.out.println("******************************************");
                        //提示用户输入信息
                        System.out.println("请选择菜单序号(1-5):");
                        int chileMenu = sc.nextInt();
                        switch (chileMenu){
                            case 1:
                                //添加菜品的实现
                                saveFood(foodDao);
                                break;
                            case 2:
                                //修改菜品实现
                                updateFood(foodDao);
                                break;
                            case 3:
                                delFood(foodDao);
                                break;
                            case 4:
                                findFood(foodDao);
                                break;
                            case 5:
                                foodFlag = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    Boolean userFlag = true;
                    while(userFlag) {
                        System.out.println("**********欢迎来到颐养中心用户管理模块************");
                        System.out.println("1.添加用户");
                        System.out.println("2.修改用户");
                        System.out.println("3.删除用户");
                        System.out.println("4.查询用户");
                        System.out.println("5.返回上一级菜单");
                        System.out.println("******************************************");
                        //提示用户输入信息
                        System.out.println("请选择菜单序号(1-5):");
                        int chileMenu = sc.nextInt();
                        switch (chileMenu) {
                            case 1:
                                System.out.println("添加用户完成!");
                                break;
                            case 2:
                                System.out.println("通过输入的id先查询数据,再进行修改操作!");
                                break;
                            case 3:
                                System.out.println("删除用户信息!");
                                break;
                            case 4:
                                System.out.println("查询用户信息!");
                                break;
                            case 5:
                                userFlag = false;
                                break;
                        }
                    }
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("退出系统成功!");
                    System.exit(0);
                default:
                    System.out.println("请选择菜单中有的编号!");
            }
        }
    }
    //菜品删除的方法
    private static void delFood(FoodDao foodDao) throws SQLException{
        //1.创建scanner输入语句用来输入菜品的id
        Scanner sc = new Scanner(System.in);
        //2.提示用户输入id
        System.out.println("请输入修改菜品的id:例如:1-10");
        //3.接收用户输入的id
        int id = sc.nextInt();
        //4.根据用户输入的id进行查询
        Food food = foodDao.findFoodById(id);
        //5.根据查询的结果来判断是否有当前记录 如果有 就进行删除的操作  如果没有  就提示没有找到相关记录 结束当前操作
        if(food.getId() == null){
            System.out.println("根据id没有查询到菜品的信息,需要重新录入id!");
        }else{
            //调用删除方法进行菜品信息的删除
            Boolean delFlag = foodDao.delFoodById(id);
            //判断结果是否删除成功
            if(delFlag){
                System.out.println("删除菜品信息成功!");
            }else{
                System.out.println("删除菜品信息失败!");
            }
        }
    }

    //查询菜品信息功能的实现
    private static void findFood(FoodDao foodDao) throws SQLException{
        //1.直接调用查询方法进行数据的查询
        List<Food> foodList = foodDao.findAll();
        //2.需要遍历结果 构建页面的列表
        System.out.println("id\t菜品名称\t菜品类型\t菜品价格\t是否回族\t菜品图片");
        for (Food food:foodList) {
            System.out.println(food.getId()+"\t"+food.getFood_name()+"\t\t"+food.getFood_type()+"\t\t"
            +food.getPrice()+"\t"+food.getIs_halal()+"\t"+food.getFood_img());
        }

    }

    //修改菜品信息
    private static void updateFood(FoodDao foodDao) throws SQLException{
        //1.创建scanner输入语句用来输入菜品的id
        Scanner sc = new Scanner(System.in);
        //2.提示用户输入id
        System.out.println("请输入修改菜品的id:例如:1-10");
        //3.接收用户输入的id
        int id = sc.nextInt();
        //4.根据用户输入的id进行查询
        Food food = foodDao.findFoodById(id);
        //5.根据查询的结果来判断是否有当前记录 如果有 就进行修改的操作  如果没有  就提示没有找到相关记录 结束当前操作
        if(food.getId()==null){
            System.out.println("根据id没有查询到菜品的信息,需要重新录入id!");
        }else{
            System.out.println(food);
            //6.如果查询到数据  需要进行修改操作
            //7.提示用户输入修改的菜品的信息(菜品的名称、菜品的价格、菜品图片)
            System.out.println("请输入修改菜品的名称:");
            String food_name = sc.next();
            System.out.println("请输入修改菜品的价格:");
            double price = sc.nextDouble();
            System.out.println("请输入修改菜品的图片:");
            String food_img = sc.next();
            //8.接收菜品的数据
            food.setFood_name(food_name);
            food.setPrice(price);
            food.setFood_img(food_img);
            //9.封装到food对象中
            Boolean editFlag = foodDao.updateFood(food);
            //10.调用接口中的修改方法进行数据的修改
            if(editFlag){
                System.out.println("菜品信息修改成功!");
            }else{
                System.out.println("菜品信息修改失败!");
            }
        }

    }

    //添加菜品信息方法
    private static void saveFood(FoodDao foodDao) throws SQLException {
        //1.创建输入信息的类scanner
        Scanner sc = new Scanner(System.in);
        //2.需要创建一个空的food的对象
        Food food = new Food();
        //3.提示用户输入菜品信息(菜品的名称、菜品的类型、菜品的价格、是否回族、菜品的图片)
        System.out.println("请输入添加菜品的名称:");
        //4.接收用户输入的信息
        String food_name = sc.next();
        System.out.println("请输入添加菜品的类型:例如:早餐/午餐/晚餐");
        String food_type = sc.next();
        System.out.println("请输入添加菜品的价格:");
        double price = sc.nextDouble();
        System.out.println("请输入数字是否回族:例如:0 是/1 不是");
        int is_halal = sc.nextInt();
        System.out.println("请输入添加菜品的图片:");
        String food_img = sc.next();
        //5.将接收到的信息封装到food对象中
        food.setFood_name(food_name);
        food.setFood_type(food_type);
        food.setPrice(price);
        food.setIs_halal(is_halal);
        food.setFood_img(food_img);
        //6.调用接口中的保存方法
        Boolean flag = foodDao.saveFood(food);
        //7.根据接口中方法的放回值来进行信息的输出
        if(flag){
            System.out.println("添加菜品信息成功!");
        }else{
            System.out.println("添加菜品信息失败!");
        }
    }
}
