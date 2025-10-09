package com.it.dao.impl;

import com.it.dao.FoodDao;
import com.it.entity.Food;
import com.it.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 食物管理功能的实现
 */
public class FoodDaoImpl implements FoodDao {
    @Override
    public List<Food> findAll() throws SQLException {
        //1.获取collection的连接
        Connection connection = JdbcUtils.getConnection();
        //2.获取statement对象
        Statement statement = connection.createStatement();
        //3.编写sql
        String sql = "select * from food";
        //4.执行sql返回resultSet的结果集
        ResultSet resultSet = statement.executeQuery(sql);
        List<Food> list =  new ArrayList<>();
        //5.遍历resultSet
        while(resultSet.next()){
            //6.封装将查询的结果封装到list集合中
            //创建一个空的food的对象
            Food food = new Food();
            int id = resultSet.getInt("id");
            String food_name = resultSet.getString("food_name");
            String food_type = resultSet.getString("food_type");
            double price = resultSet.getDouble("price");
            int is_halal = resultSet.getInt("is_halal");
            String food_img = resultSet.getString("food_img");
            //将查询的结果封装到对象中
            food.setId(id);
            food.setFood_name(food_name);
            food.setFood_type(food_type);
            food.setPrice(price);
            food.setIs_halal(is_halal);
            food.setFood_img(food_img);
            //将对象存入集合中
            list.add(food);
        }

        //7.关闭连接
        return list;
    }
}
