package gui.listener;

import gui.panel.ShowPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField tf = (JTextField) ShowPanel.instance.getComponent(0);
        tf.setText("");
    }

}
