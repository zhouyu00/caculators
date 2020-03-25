package gui.panel;

import util.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    public static MainPanel instance  = new MainPanel();
    private MainPanel(){
        this.setLayout(new BorderLayout());
        this.add(ShowPanel.instance,BorderLayout.NORTH);
        this.add(InputPanel.instance,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(MainPanel.instance);
    }
}
