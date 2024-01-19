/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

//5 Steps of JDBS Connectivity 
/**
 *  1 - Register the Driver class
 *  2 - Creating the connection String
 *  3 - Creating statement
 *  4 - Executing mysql queries
 *  5 - Closing the connections
 */

import java.sql.*;


public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            // Đăng ký lớp trình điều khiển
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Tạo chuỗi kết nối
            c = DriverManager.getConnection("jdbc:mysql://localhost:3308/employeemanagementsystem", "root", "orcl");
            // Tạo một câu lệnh
            s = c.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
