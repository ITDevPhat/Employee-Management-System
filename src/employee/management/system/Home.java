
package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// Lớp Home là lớp chính hiển thị giao diện người dùng cho hệ thống quản lý nhân viên
public class Home extends JFrame implements ActionListener{
    // Các nút chức năng trên giao diện
    JButton view, add, update, remove;
    
    Home() {
        // Thiết lập layout của frame là null để có thể tự do đặt vị trí các phần tử
        setLayout(null);
        
        //Thêm Hình Ảnh (image)
        //Thêm một hình ảnh vào splash screen bằng cách sử dụng ImageIcon.
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1120,630); 
        add(image);
        
        // Tiêu đề cho hệ thống quản lý nhân viên
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620, 20, 400, 40);
        heading.setFont(new Font("Arial", Font.BOLD, 25));
        image.add(heading);
        
        // Tạo nút thêm nhân viên chức năng và đăng ký sự kiện ActionListener
        add = new JButton("Add Employee");
        add.setBounds(650, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        // Tạo nút xem nhân viên chức năng và đăng ký sự kiện ActionListener
        view = new JButton("View Employee");
        view.setBounds(820, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        // Tạo nút cập nhật nhân viên chức năng và đăng ký sự kiện ActionListener
        update = new JButton("Update Employee");
        update.setBounds(650, 140, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        // Tạo nút xóa nhân viên chức năng và đăng ký sự kiện ActionListener
        remove = new JButton("Remove Employee");
        remove.setBounds(820, 140, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        
        // Thiết lập kích thước và hiển thị frame
        setSize(1120,630);
        setLocation(250, 100);
        setVisible(true);
    }
    
    // Xử lý sự kiện khi người dùng click vào các nút chức năng
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            
        } else if (ae.getSource() == view) {
            
        } else if (ae.getSource() == update) {
            
        } else { //remove
            
        }
    }
    
    // Phương thức main để thử nghiệm giao diện
    public static void main(String[] args) {
        new Home();
        
    }
}
