package com.it.dao;

import com.it.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * 用户管理功能接口
 */
public interface UserDao {
    //用户列表查询(带着逻辑删除的条件)
    List<User> findUser() throws SQLException;
    //用户列表查询(带分页)
    List<User> findPage(int currentPage,int pageSize) throws SQLException;
    //用户添加
    Boolean saveUser(User user) throws SQLException;
    //用户数据更新
    Boolean updateUser(User user) throws  SQLException;
    //查询单个用户数据\
    User findUserById(Integer id) throws SQLException;
    //用户删除功能
    Boolean delUserById(User user) throws SQLException;
}
