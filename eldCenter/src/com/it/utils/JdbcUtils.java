package com.it.utils;

import java.sql.*;
import java.util.ResourceBundle;

public class JdbcUtils {
    //1.先定义连接数据库的常量
    //数据库的驱动
    private static String driver = null;
    //数据库的连接信息
    private static String url = null;
    //用户名
    private static String username = null;
    //密码
    private static String password = null;
    //statement
    private static Statement st = null;
    //resultset
    private static PreparedStatement ps = null;
    //提供一个conn
    private static Connection conn = null;
    //2.通过java中的代码来获取properties中的属性值,并将属性值赋值给数据库的常量
    static {
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        driver = rb.getString("jdbc.driver");
        url = rb.getString("jdbc.url");
        username = rb.getString("jdbc.user");
        password = rb.getString("jdbc.password");

        try{
            //3.获取数据库的连接connection
            //获取数据库的连接
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
            st = conn.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //4.需要定义一个静态方法来获取connection对象
    public static Connection getConnection(){
        return conn;
    }
    //Statement静态方法
    public static Statement getStatement(){
        return st;
    }
    //preparStatement
    public static PreparedStatement getPreparedStatement(String sql){
        try{
            ps = conn.prepareStatement(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ps;
    }
    //5.提供jdbc资源关闭的方法
    public static void close(ResultSet rs, Statement sm, Connection con){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (sm != null) {
            try {
                sm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
