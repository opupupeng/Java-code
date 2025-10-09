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
            List<Food> all = foodDao.findAll();
            for (Food food:all) {
                System.out.println(food);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
