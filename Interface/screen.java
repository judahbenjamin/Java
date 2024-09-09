package Interface;

import javax.swing.JFrame;

public class screen {
    public screen(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(800,500);
        jFrame.setTitle("Exemplo 01");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
    }
}