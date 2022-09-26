package main;

import javax.swing.*;

/*.
    class này để tạo window
    window được tạo ra bằng cách sử dụng JFrame
    Jframe giúp tạo ra các giao diện người dùng
    Jframe giống như một cái khung
 */
public class GameWindow {

    private JFrame jFrame;
    public GameWindow(GamePanel gamePanel) {
        // ở đây ta sẽ ghép phần Panel vào phần frame qua việc truyền phần tử gamePanel vào method và add vào jframe
        jFrame = new JFrame(); // tạo ra đối tượng Jframe
        jFrame.setSize(400,400); // cài đặt kích thước của window

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // để báo cho máy biết khi ấn đóng cửa sổ sẽ kill tiến trình
        jFrame.add(gamePanel);
        jFrame.setLocationRelativeTo(null); // cài đặt jpanel ở giữa màn hình
        jFrame.setVisible(true);  // cài đặt cho cửa sổ có hiển thị
        /*
        Chú ý, setVisible cần phải đặt sau setdefaultClose vì nếu không khi thay đổi kích thước cửa sổ, màn hình game sẽ bị mất
         */
        //jFrame.setBackground();
    }
}