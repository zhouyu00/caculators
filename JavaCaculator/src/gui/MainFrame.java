package gui;

import gui.panel.MainPanel;

import javax.swing.*;

public class MainFrame extends JFrame{

    public static MainFrame instance = new MainFrame();

    private MainFrame(){
        this.setSize(400,500);
        this.setContentPane(MainPanel.instance);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
