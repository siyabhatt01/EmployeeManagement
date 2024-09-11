package com.EmployeeDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection createConnection() {
         Connection con = null;

        try {
            
                // Register JDBC Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create Connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "scotlee2003");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Failed to create a database connection.");
            e.printStackTrace();
        }

        return con;
    }
}
