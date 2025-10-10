package com.it.dao.impl;

import com.it.dao.UserDao;
import com.it.entity.User;
import com.it.utils.JdbcUtils;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户管理功能实现
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findUser() throws SQLException {
        //1.编写sql
        String sql = "select * from user  where is_deleted = ?";
        //2.获取预编译对象
        PreparedStatement ps = JdbcUtils.getPreparedStatement(sql);
        //3.执行sql并返回resultSet的结果
        ps.setObject(1,0);
        ResultSet rs = ps.executeQuery();
        //定义一个空的集合,用来存储结果集中的数据
        List<User> list = new ArrayList<>();
        //4.遍历resultSet结果
        while (rs.next()){
            //5.将结果封装到list中
            int id = rs.getInt("id");
            Date create_time = rs.getDate("create_time");
            int create_by = rs.getInt("create_by");
            Date update_time = rs.getDate("update_time");
            int update_by = rs.getInt("update_by");
            int is_deleted = rs.getInt("is_deleted");
            String nickname = rs.getString("nickname");
            String username = rs.getString("username");
            String password = rs.getString("password");
            int sex = rs.getInt("sex");
            String email = rs.getString("email");
            String phone_number = rs.getString("phone_number");
            int role_id = rs.getInt("role_id");

            //创建用户对象用来封装查询的信息
            User user  = new User();
            user.setId(id);
            user.setCreate_time(create_time);
            user.setCreate_by(create_by);
            user.setUpdate_time(update_time);
            user.setUpdate_by(update_by);
            user.setIs_deleted(is_deleted);
            user.setNickname(nickname);
            user.setUsername(username);
            user.setPassword(password);
            user.setSex(sex);
            user.setEmail(email);
            user.setPhone_number(phone_number);
            user.setRole_id(role_id);
            list.add(user);
        }

        //6.返回list
        return list;
    }

    @Override
    public List<User> findPage(int currentPage, int pageSize) throws SQLException {
        //1.编写sql
        String sql = "select * from  user  where is_deleted = ? limit ?,?";
        //2.获取预编译对象
        PreparedStatement ps = JdbcUtils.getPreparedStatement(sql);
        //3.执行sql并返回resultSet的结果
        ps.setObject(1,0);
        //需要通过计算还获取(当前页-1)*每页显示的条数
        ps.setObject(2,(currentPage-1)*pageSize);
        ps.setObject(3,pageSize);
        ResultSet rs = ps.executeQuery();
        //定义一个空的集合,用来存储结果集中的数据
        List<User> list = new ArrayList<>();
        //4.遍历resultSet结果
        while (rs.next()){
            //5.将结果封装到list中
            int id = rs.getInt("id");
            Date create_time = rs.getDate("create_time");
            int create_by = rs.getInt("create_by");
            Date update_time = rs.getDate("update_time");
            int update_by = rs.getInt("update_by");
            int is_deleted = rs.getInt("is_deleted");
            String nickname = rs.getString("nickname");
            String username = rs.getString("username");
            String password = rs.getString("password");
            int sex = rs.getInt("sex");
            String email = rs.getString("email");
            String phone_number = rs.getString("phone_number");
            int role_id = rs.getInt("role_id");

            //创建用户对象用来封装查询的信息
            User user  = new User();
            user.setId(id);
            user.setCreate_time(create_time);
            user.setCreate_by(create_by);
            user.setUpdate_time(update_time);
            user.setUpdate_by(update_by);
            user.setIs_deleted(is_deleted);
            user.setNickname(nickname);
            user.setUsername(username);
            user.setPassword(password);
            user.setSex(sex);
            user.setEmail(email);
            user.setPhone_number(phone_number);
            user.setRole_id(role_id);
            list.add(user);
        }

        //6.返回list
        return list;
    }

    @Override
    public Boolean saveUser(User user) throws SQLException {
        //1.创建sql语句
        String sql = "insert into user values(null,?,?,?,?,?,?,?,?,?,?,?,?)";
        //2.通过工具类获取预编译对象
        PreparedStatement ps = JdbcUtils.getPreparedStatement(sql);
        //3.设置插入的数据
        ps.setObject(1,user.getCreate_time());
        ps.setObject(2,user.getCreate_by());
        ps.setObject(3,user.getUpdate_time());
        ps.setObject(4,user.getUpdate_by());
        ps.setObject(5,user.getIs_deleted());
        ps.setObject(6,user.getNickname());
        ps.setObject(7,user.getUsername());
        ps.setObject(8,user.getPassword());
        ps.setObject(9,user.getSex());
        ps.setObject(10,user.getEmail());
        ps.setObject(11,user.getPhone_number());
        ps.setObject(12,user.getRole_id());

        //4.执行sql并返回结果
        int count = ps.executeUpdate();
        Boolean flag = false;
        if(count>0){
            flag = true;
        }

        return flag;
    }

    @Override
    public Boolean updateUser(User user) throws SQLException {
        //1.编写sql
        String sql = "update user set nickname = ? ,sex = ?,phone_number = ?  where id = ?";
        //2.获取预编译对象
        PreparedStatement ps = JdbcUtils.getPreparedStatement(sql);
        //3.设置修改的数据
        ps.setObject(1,user.getNickname());
        ps.setObject(2,user.getSex());
        ps.setObject(3,user.getPhone_number());
        ps.setObject(4,user.getId());
        //4.执行sql并返回结果
        int count = ps.executeUpdate();

        boolean flag = false;
        if(count>0){
            flag = true;
        }
        return flag;
    }

    @Override
    public User findUserById(Integer id) throws SQLException {
        //1.创建sql
        String sql = "select * from user where id = ?";
        //2.获取预编译对象
        PreparedStatement ps = JdbcUtils.getPreparedStatement(sql);
        //3.设置查询需要的参数
        ps.setObject(1,id);
        //4.执行sql并返回数据
        ResultSet rs = ps.executeQuery();
        //创建用户对象用来封装查询的信息
        User user  = new User();
        while(rs.next()){
            //5.将结果封装到list中
            int userId = rs.getInt("id");
            Date create_time = rs.getDate("create_time");
            int create_by = rs.getInt("create_by");
            Date update_time = rs.getDate("update_time");
            int update_by = rs.getInt("update_by");
            int is_deleted = rs.getInt("is_deleted");
            String nickname = rs.getString("nickname");
            String username = rs.getString("username");
            String password = rs.getString("password");
            int sex = rs.getInt("sex");
            String email = rs.getString("email");
            String phone_number = rs.getString("phone_number");
            int role_id = rs.getInt("role_id");


            user.setId(userId);
            user.setCreate_time(create_time);
            user.setCreate_by(create_by);
            user.setUpdate_time(update_time);
            user.setUpdate_by(update_by);
            user.setIs_deleted(is_deleted);
            user.setNickname(nickname);
            user.setUsername(username);
            user.setPassword(password);
            user.setSex(sex);
            user.setEmail(email);
            user.setPhone_number(phone_number);
            user.setRole_id(role_id);
        }
        return user;
    }

    @Override
    public Boolean delUserById(User user) throws SQLException {
        //1.编写sql
        String sql = "update user set is_deleted = ? where id = ?";
        //2.获取预编译对象
        PreparedStatement ps = JdbcUtils.getPreparedStatement(sql);
        //3.设置参数
        ps.setObject(1,user.getIs_deleted());
        ps.setObject(2,user.getId());
        //4.执行sql返回结果
        int count = ps.executeUpdate();

        boolean flag = false;
        if(count>0){
            flag = true;
        }
        return flag;
    }

}
