package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel(){
    }

    /*
    method không thực sự được gọi trực tiếp
    Nó được gọi bất cứ khi nào chúng ta nhấn nút
    Graphics như là một đối tượng truyền vào
     */

    public void paintComponent(Graphics g) {
        /*
        Thực ra chúng ta đang gọi JComponent của class PaintComponent
        jComponent là một superclass của JPanel
         */
        super.paintComponent(g);

        g.drawRect(100,100, 200,50);
    }
}
