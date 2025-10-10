package com.it.dao;

import com.it.entity.Food;

import java.sql.SQLException;
import java.util.List;

/**
 * 食物管理模块
 */
public interface FoodDao {
    //食物列表查询
    public List<Food> findAll() throws SQLException;
    //食物添加功能
    Boolean saveFood(Food food) throws SQLException;
    //食物修改功能
    Boolean updateFood(Food food) throws SQLException;
    //食物管理删除功能
    Boolean delFoodById(Integer id) throws  SQLException;
}
