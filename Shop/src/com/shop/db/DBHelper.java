package com.shop.db;

import java.sql.*;

public class DBHelper {
    protected final String HOST = "jdbc:mysql://127.0.0.1/shop";
    protected final String USER = "root";
    protected final String PASS = "1234";
    protected Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(HOST,USER,PASS);
    }
    protected Connection conn =null;
    protected PreparedStatement psmt;
    protected Statement stmt;
    protected ResultSet rs;
    protected void close() throws SQLException {
        if(rs!=null)
            rs.close();
        if(psmt!=null)
            psmt.close();
        if(stmt!=null)
            stmt.close();
        if(conn!=null)
            conn.close();
    }

}
