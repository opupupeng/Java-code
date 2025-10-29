package com.it.utils;

import java.sql.*;
import java.util.ResourceBundle;

public class JdbcUtil {
    private static String url;
    private static String username;
    private static String password;

    static {
        try {
            // 加载数据库配置
            ResourceBundle bundle = ResourceBundle.getBundle("db");
            url = bundle.getString("jdbc.url");
            username = bundle.getString("jdbc.username");
            password = bundle.getString("jdbc.password");

            // 加载驱动
            Class.forName(bundle.getString("jdbc.driver"));
        } catch (Exception e) {
            throw new RuntimeException("数据库连接初始化失败", e);
        }
    }

    // 获取数据库连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    // 关闭资源
    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
