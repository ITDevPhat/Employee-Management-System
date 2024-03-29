/**
 * Lớp AddEmployee được sử dụng để thu thập và lưu trữ thông tin của một nhân viên mới.
 * Nó mở rộng từ JFrame và triển khai ActionListener để xử lý sự kiện.
 */

package employee.management.system;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener {
    //Tạm thời sử dụng hàm random để random ID của nhân viên
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    // Các trường văn bản cho các chi tiết nhân viên khác nhau
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    // DateChooser cho Ngày sinh
    JDateChooser dcdob;
    // ComboBox cho trình độ học vấn cao nhất
    JComboBox cbeducation;
    // Nhãn để hiển thị ID nhân viên
    JLabel lblempID;
    // Các nút để thêm chi tiết và quay lại
    JButton add, back;

    
    // Constructor để thiết lập các thành phần UI
    AddEmployee() {
        
        // Thiết lập layout của JFrame và màu nền
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Nhãn tiêu đề cho biểu mẫu chi tiết nhân viên
        JLabel heading = new JLabel("Add employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

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

        dcdob = new JDateChooser();
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
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));;
        add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        JLabel labeleducation = new JLabel("Highest Education");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));;
        add(labeleducation);

        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTECH", "MBA", "MCA", "MA", "MTech", "MSC"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);

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

        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);

        JLabel labelempID = new JLabel("Employee ID");
        labelempID.setBounds(50, 400, 150, 30);
        labelempID.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempID);

        lblempID = new JLabel("" + number);
        lblempID.setBounds(200, 400, 150, 30);
        add(lblempID);

        // Tạo nút thêm nhân viên chức năng và đăng ký sự kiện ActionListener
        add = new JButton("Add Details");
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
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empID = lblempID.getText();

            try {
                //Tạo kết nối tới Mysql
                Conn conn = new Conn();
                //Tạo câu truy vấn
                String query = "insert into employee values('" + name + "', '" + fname + "', '" + dob + "', '" + salary + "', '" + address + "', '" + phone + "', '" + email + "', '" + education + "', '" + designation + "', '" + aadhar + "', '" + empID + "')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
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
        new AddEmployee();
    }
}
