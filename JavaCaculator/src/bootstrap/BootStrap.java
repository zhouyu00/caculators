package bootstrap;

import gui.MainFrame;

import javax.swing.*;

public class BootStrap {
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                MainFrame.instance.setVisible(true);
            }
        });
    }
}
