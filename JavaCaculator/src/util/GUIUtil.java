package util;

import javax.swing.*;

public class GUIUtil {
    public static void showPanel(JPanel p){
        JFrame f = new JFrame();
        f.setSize(400,500);
        f.setLocationRelativeTo(null);
        f.setContentPane(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
