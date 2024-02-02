/**
 * Lớp UpdateEmployee được sử dụng để thu thập và lưu trữ thông tin của một nhân viên mới.
 * Nó mở rộng từ JFrame và triển khai ActionListener để xử lý sự kiện.
 */

package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener {

    // Các trường văn bản cho các chi tiết nhân viên khác nhau
    JTextField tfeducation, tffname, tfaddress, tfphone, tfemail, tfsalary, tfdesignation;

    // Nhãn để hiển thị ID nhân viên
    JLabel lblempID;
    // Các nút để thêm chi tiết và quay lại
    JButton add, back;
    
    String empID;

    
    // Constructor để thiết lập các thành phần UI
    UpdateEmployee(String empID) {
        this.empID = empID;
        // Thiết lập layout của JFrame và màu nền
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Nhãn tiêu đề cho biểu mẫu chi tiết nhân viên
        JLabel heading = new JLabel("Update Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);

        JLabel lblname = new JLabel();
        lblname.setBounds(200, 150, 150, 30);
        add(lblname);

        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);

        JLabel dcdob = new JLabel();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);

        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);

        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);

        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        JLabel labeleducation = new JLabel("Highest Education");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);

        tfeducation = new JTextField();
        tfeducation.setBounds(600, 300, 150, 30);
        add(tfeducation);

        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);

        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);

        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);

        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(600, 350, 150, 30);
        add(lblaadhar);

        JLabel labelempID = new JLabel("Employee ID");
        labelempID.setBounds(50, 400, 150, 30);
        labelempID.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempID);

        lblempID = new JLabel();
        lblempID.setBounds(200, 400, 150, 30);
        add(lblempID);

        try {
            Conn c = new Conn();
            String query = "Select * from employee where empID = '"+ empID +"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while  (rs.next()) {
                lblname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                dcdob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfeducation.setText(rs.getString("education"));
                tfdesignation.setText(rs.getString("designation"));
                lblaadhar.setText(rs.getString("aadhar"));
                lblempID.setText(rs.getString("empID"));
                
                
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        // Tạo nút thêm nhân viên chức năng và đăng ký sự kiện ActionListener
        add = new JButton("Update Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);

        // Tạo nút thêm nhân viên chức năng và đăng ký sự kiện ActionListener
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        
        
        // Thiết lập kích thước và vị trí của JFrame
        setSize(800, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    
    // Triển khai ActionListener để xử lý sự kiện khi nút được nhấp
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            
            // Truy xuất giá trị từ các trường văn bản và tạo một nhân viên mới
           
            String fname = tffname.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();
            try {
                //Tạo kết nối tới Mysql
                Conn conn = new Conn();
                //Tạo câu truy vấn
                String query = "update employee set fname ='"+fname+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"', education = '"+education+"', designation = '"+designation+"' where empID = '"+empID+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                // Quay lại màn hình chính
                new Home();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // Quay lại màn hình chính mà không thêm chi tiết
            setVisible(false);
            new Home();
        }
    }
    // Phương thức main để tạo và hiển thị frame AddEmployee
    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}
