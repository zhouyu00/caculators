package gui.listener;

import gui.panel.ShowPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        JTextField tf = (JTextField) ShowPanel.instance.getComponent(0);
        String content = tf.getText();
        System.out.println(b.getText());
        tf.setText(content+b.getText());
    }
}
