
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
    //Phương thức khởi tạo của lớp Splash.
    Splash() {
        //Thiết Lập Nền và Layout - Đặt màu nền của cửa sổ là trắng và sử dụng layout tự do.
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //Thêm một đối tượng JLabel để hiển thị tiêu đề của splash screen.
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);
        
        
        //Thêm Hình Ảnh (image)
        //Thêm một hình ảnh vào splash screen bằng cách sử dụng ImageIcon.
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(50,100,1050,500); 
        add(image);
        
        
        //Thêm Nút (clickHere) và Đặt Thuộc Tính:
        //Thêm một nút "Click here to continue" vào hình ảnh.
        JButton clickHere = new JButton("Click here to continue");
        clickHere.setBounds(400, 400, 300, 70);
        clickHere.setBackground(Color.BLACK);
        clickHere.setForeground(Color.WHITE);
        //Dòng này đảm bảo rằng phương thức actionPerformed của lớp Splash sẽ được gọi khi nút được nhấn.
        clickHere.addActionListener(this);
        image.add(clickHere);
        
        //Thiết Lập Kích Thước và Hiển Thị Cửa Sổ:
        //Thiết lập kích thước, vị trí, và hiển thị cửa sổ.
        //Đặt default close operation để thoát khi đóng cửa sổ.
        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //Vòng Lặp Vô Hạn Cho Hiệu Ứng:
        //Vòng lặp vô hạn để tạo hiệu ứng nhấp nháy cho tiêu đề của splash screen.
        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
            
            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }
    }
    /**
     * Phương thức này được gọi khi nút "Click here to continue" được nhấn. 
     * Nó ẩn cửa sổ splash screen 
     * và tạo một đối tượng Login mới, chuyển đến cửa sổ đăng nhập.
     * @param ae 
     */
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]) {
        Splash s = new Splash();
    }
}
