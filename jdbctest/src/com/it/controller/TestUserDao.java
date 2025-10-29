package com.it.controller;

import com.it.dao.UserDao;
import com.it.entity.User;

import java.util.List;

public class TestUserDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // 测试添加用户
        User newUser = new User("zhangsan", "123456", "zhangsan@example.com", 25);
        boolean success = userDao.addUser(newUser);
        System.out.println("添加用户" + (success ? "成功" : "失败"));

        // 测试查询用户
        User user = userDao.getUserByUsername("zhangsan");
        if (user != null) {
            System.out.println("查询到的用户: " + user);
        }

        // 测试查询所有用户
        List<User> users = userDao.getAllUsers();
        System.out.println("所有用户:");
        for (User u : users) {
            System.out.println(u);
        }

        // 测试更新用户
        if (user != null) {
            user.setEmail("newemail@example.com");
            user.setAge(26);
            boolean updateSuccess = userDao.updateUser(user);
            System.out.println("更新用户" + (updateSuccess ? "成功" : "失败"));
        }
    }
}
