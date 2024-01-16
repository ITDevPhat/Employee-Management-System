/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;


public class Login extends JFrame{
    Login() {
        //Setting Background and Layout
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //Username Label and TextField
        JLabel lblUsername = new JLabel ("Username");
        lblUsername.setBounds(40, 20, 100, 30);
        add(lblUsername);
        
        JTextField tfUsername = new JTextField();
        tfUsername.setBounds(150, 20, 150, 30);
        add(tfUsername);
        
        //Password Label and TextField
        JLabel lblPassword = new JLabel ("Password");
        lblPassword.setBounds(40, 70, 100, 30);
        add(lblPassword);
        
        JTextField tfPassword= new JTextField();
        tfPassword.setBounds(150, 70, 150, 30);
        add(tfPassword);
        
        //Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 140, 150, 30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        add(loginButton);
        
        //ImageIcon và JLabel cho hình ảnh
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
         
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200); 
        add(image);
        
        //Cài đặt kích thước và khả năng hiển thị:
        setSize(600,300);
        setLocation(450, 200);
        setVisible(true);
    }   
    
    public static void main(String[] args) {
        new Login();
    }
}
