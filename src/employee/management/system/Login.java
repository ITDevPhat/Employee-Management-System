/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField tfUsername, tfPassword;
    
    Login() {
         // Setting Background and Layout
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Username Label and TextField
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(40, 20, 100, 30);
        add(lblUsername);

        tfUsername = new JTextField();
        tfUsername.setBounds(150, 20, 150, 30);
        add(tfUsername);

        // Password Label and TextField
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(40, 70, 100, 30);
        add(lblPassword);

        tfPassword = new JTextField();
        tfPassword.setBounds(150, 70, 150, 30);
        add(tfPassword);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 140, 150, 30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        //thực hiện hành động login
        loginButton.addActionListener(this);
        add(loginButton);

        // ImageIcon và JLabel cho hình ảnh
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        // Cài đặt kích thước và khả năng hiển thị:
        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }   
    
    public void actionPerformed (ActionEvent ae) {
        try {
            // Lấy giá trị từ TextField để kiểm tra đăng nhập
            String username = tfUsername.getText();
            String password = tfPassword.getText();
            
            // Tạo đối tượng Conn để thực hiện kết nối đến cơ sở dữ liệu
            Conn c = new Conn();
            // Tạo câu truy vấn SQL kiểm tra thông tin đăng nhập
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
            
            // Thực hiện câu truy vấn và nhận kết quả trong ResultSet
            ResultSet rs;
            rs = c.s.executeQuery(query);
            
            
            // Kiểm tra xem có bản ghi nào trong ResultSet hay không
            if (rs.next()) {
                // Nếu có, ẩn frame hiện tại (đăng nhập thành công)
                setVisible(false);
                //next class
            } else {
                // Nếu không, hiển thị thông báo lỗi và ẩn frame
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);

            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public static void main(String[] args) {
        new Login();
    }
}
