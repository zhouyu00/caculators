package gui.panel;

import util.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class ShowPanel extends JPanel {
    public static ShowPanel instance = new ShowPanel();


    private ShowPanel(){
        JTextField tf = new JTextField();
        tf.setHorizontalAlignment(JTextField.RIGHT);
        tf.setPreferredSize(new Dimension(400,100));
        tf.setColumns(15);
        tf.setFont(new Font("微软雅黑",Font.BOLD,25));

        this.setPreferredSize(new Dimension(400,100));
        this.add(tf);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(ShowPanel.instance);
    }
}
