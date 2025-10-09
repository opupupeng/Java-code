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
}
