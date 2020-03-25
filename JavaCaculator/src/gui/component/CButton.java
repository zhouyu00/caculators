package gui.component;

import gui.listener.InputListener;

import javax.swing.*;

public class CButton extends JButton {
    CButton(){
        super();
    }

    public CButton(String text) {
        super(text);
        this.addActionListener(new InputListener());
    }
}
