package com.it.controller;

import com.it.dao.FoodDao;
import com.it.dao.impl.FoodDaoImpl;
import com.it.entity.Food;
import com.it.utils.JdbcUtils;

import java.sql.Connection;
import java.util.List;

/**
 * 食物管理模块
 */

public class FoodController {

    public static void main(String[] args) {
        //1.测试工具类是否能够使用
        //Connection connection = JdbcUtils.getConnection();
        //System.out.println(connection);
        //直接调用接口中的方法并输出结果
        FoodDao foodDao = new FoodDaoImpl();
        //调用方法
        try{
            //1.食物管理查询所有
           /* List<Food> all = foodDao.findAll();
            for (Food food:all) {
                System.out.println(food);
            }*/
            //2.食物管理添加功能
            //通过food的实体类来封装添加的数据
            //Food food = new Food();
            //食物名称
            /*food.setFood_name("麻辣烫");
            food.setFood_type("主食");
            food.setPrice(13);
            food.setIs_halal(0);
            food.setFood_img("malatang.jpg");*/

            //需要在调用方法的时候返回一个结果,这个结果就代表是否保存数据成功
            //Boolean flag = foodDao.saveFood(food);
            /*if(flag){
                System.out.println("食物信息添加成功!");
            }else{
                System.out.println("食物信息添加失败!");
            }*/
            //3.食物管理的修改功能
            /*food.setFood_name("麻辣香锅");
            food.setFood_type("晚餐");
            food.setId(9);
            //调用接口中的修改方法
            Boolean flag = foodDao.updateFood(food);
            if(flag){
                System.out.println("食物信息修改成功!");
            }else{
                System.out.println("食物信息修改失败!");
            }*/
            //4.食物管理删除功能
           Boolean flag = foodDao.delFoodById(14);
            if(flag){
                System.out.println("食物信息删除成功!");
            }else{
                System.out.println("食物信息删除失败!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
