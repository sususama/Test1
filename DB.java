package edu.xatu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection getConntect(){
        Connection conn = null;
        try {
            String driverClass="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/mybd";
            String username="root";
            String password="123456";
            Class.forName(driverClass);
            conn = DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void close(Connection conn){
        try {
            if(conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
}