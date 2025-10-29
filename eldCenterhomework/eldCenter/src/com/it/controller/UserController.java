package com.it.controller;

import com.it.dao.UserDao;
import com.it.dao.impl.UserDaoImpl;
import com.it.entity.User;
import com.it.utils.Md5Utils;

import java.util.Date;
import java.util.List;

/**
 * 用户管理功能实现
 */
public class UserController {
    public static void main(String[] args) {
        //1.用户管理功能查询
        UserDao userDao = new UserDaoImpl();
        try{

            List<User> userList = userDao.findUser();
            for (User user:userList) {
                System.out.println(user);
            }
            //2.带分页的数据查询
            /*List<User> pageList = userDao.findPage(2, 2);
            for (User user:pageList) {
                System.out.println(user);
            }*/
            //3.用户管理添加功能
            User user = new User();
            /*user.setCreate_time(new Date());
            user.setCreate_by(2);
            user.setUpdate_time(new Date());
            user.setUpdate_by(2);
            user.setIs_deleted(0);
            user.setNickname("普通用户");
            user.setUsername("admin");
            user.setPassword(Md5Utils.md5("admin"));
            user.setSex(1);
            user.setEmail("642265501@qq.com");
            user.setPhone_number("15423545621");
            user.setRole_id(2);

            //调用保存方法
            Boolean flag = userDao.saveUser(user);

            if(flag){
                System.out.println("用户信息添加成功!");
            }else {
                System.out.println("用户信息添加失败!");
            }*/
            //4.用户管理修改功能
            /*user.setNickname("关羽");
            user.setSex(0);
            user.setPhone_number("15023456124");
            user.setId(8);

            Boolean flag = userDao.updateUser(user);
            if(flag){
                System.out.println("用户数据修改成功!");
            }else{
                System.out.println("用户数据修改失败!");
            }*/
            //5.在修改用户数据之前需要先通过用户id查询用户数据 进行数据的回显
            //User users = userDao.findUserById(8);
            //System.out.println(users);
            //6.用户数据删除功能(逻辑删除)
            user.setId(8);
            user.setIs_deleted(1);

            Boolean flag = userDao.delUserById(user);

            if(flag){
                System.out.println("用户数据删除成功!");
            }else {
                System.out.println("用户数据删除失败!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
