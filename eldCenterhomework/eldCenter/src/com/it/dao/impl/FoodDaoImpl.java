package com.it.dao.impl;

import com.it.dao.FoodDao;
import com.it.entity.Food;
import com.it.utils.JdbcUtils;

import java.sql.*;
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

    @Override
    public Boolean saveFood(Food food) throws SQLException{
        //1.先创建sql
        String sql = "insert into food values (null,?,?,?,?,?)";
        //2.获取预编译对象防止sql注入
        PreparedStatement ps = JdbcUtils.getPreparedStatement(sql);
        //设置插入数据
        ps.setObject(1,food.getFood_name());
        ps.setObject(2,food.getFood_type());
        ps.setObject(3,food.getPrice());
        ps.setObject(4,food.getIs_halal());
        ps.setObject(5,food.getFood_img());
        //3.执行sql
        int count = ps.executeUpdate();
        //4.判断返回的结果是否插入成功
        boolean flag = false;
        if(count>0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean updateFood(Food food) throws SQLException {
        //1.编写更新的sql语句
        String sql = "update food set food_name = ? ,food_type = ?,price = ?,is_halal = ? ,food_img = ?  where id = ? ";
        //2.获取预编译对象
        PreparedStatement ps = JdbcUtils.getPreparedStatement(sql);
        //3.设置更新语句中的参数
        ps.setObject(1,food.getFood_name());
        ps.setObject(2,food.getFood_type());
        ps.setObject(3,food.getPrice());
        ps.setObject(4,food.getIs_halal());
        ps.setObject(5,food.getFood_img());
        ps.setObject(6,food.getId());
        //4.执行sql并返回影响的行
        int count = ps.executeUpdate();
        //5.判断返回的结果是否大于0
        boolean flag = false;
        if(count>0){
            flag = true;
        }

        return flag;
    }

    @Override
    public Boolean delFoodById(Integer id) throws SQLException {
        //1.编写删除的sql
        String sql = "delete  from food  where id = ? ";
        //2.获取预编译对象
        PreparedStatement ps = JdbcUtils.getPreparedStatement(sql);
        //3.设置参数值
        ps.setObject(1,id);
        //4.执行sql并返回结果
        int count = ps.executeUpdate();
        //5.根据结果判断 返回判断的结果
        Boolean flag = false;
        if(count>0){
            flag = true;
        }
        return flag;
    }

    @Override
    public Food findFoodById(Integer id) throws SQLException {
        //3.编写sql
        String sql = "select * from food where id = ?";
        //4.执行sql返回resultSet的结果集
        PreparedStatement ps = JdbcUtils.getPreparedStatement(sql);
        ps.setObject(1,id);

        ResultSet resultSet = ps.executeQuery();
        Food food = new Food();
        //5.遍历resultSet
        while(resultSet.next()){
            //6.封装将查询的结果封装到list集合中
            //创建一个空的food的对象

            int foodId = resultSet.getInt("id");
            String food_name = resultSet.getString("food_name");
            String food_type = resultSet.getString("food_type");
            double price = resultSet.getDouble("price");
            int is_halal = resultSet.getInt("is_halal");
            String food_img = resultSet.getString("food_img");
            //将查询的结果封装到对象中
            food.setId(foodId);
            food.setFood_name(food_name);
            food.setFood_type(food_type);
            food.setPrice(price);
            food.setIs_halal(is_halal);
            food.setFood_img(food_img);
        }
        return food;
    }
}
