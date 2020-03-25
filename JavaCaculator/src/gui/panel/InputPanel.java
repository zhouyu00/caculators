package gui.panel;

import gui.component.CButton;
import gui.listener.ClearListener;
import gui.listener.ComputeListener;
import util.GUIUtil;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class InputPanel extends JPanel {

    public static InputPanel instance = new InputPanel();
    private InputPanel(){
        JPanel InputLeftPanel = new JPanel();
        JPanel InputRightPanel = new JPanel();
        //Number
        CButton bZero = new CButton("0");
        CButton bOne = new CButton("1");
        CButton bTwo = new CButton("2");
        CButton bThree = new CButton("3");
        CButton bFour = new CButton("4");
        CButton bFive = new CButton("5");
        CButton bSix = new CButton("6");
        CButton bSeven = new CButton("7");
        CButton bEight = new CButton("8");
        CButton bNine = new CButton("9");

        CButton blParentheses = new CButton("(");
        CButton brParentheses = new CButton(")");
        CButton bPercent = new CButton("%");
        JButton bEqual = new JButton("=");
        CButton bPoint = new CButton(".");

        InputLeftPanel.setLayout(new GridLayout(6,3));
        InputLeftPanel.add(blParentheses);
        InputLeftPanel.add(brParentheses);
        InputLeftPanel.add(bPercent);
        InputLeftPanel.add(bSeven);
        InputLeftPanel.add(bEight);
        InputLeftPanel.add(bNine);
        InputLeftPanel.add(bFour);
        InputLeftPanel.add(bFive);
        InputLeftPanel.add(bSix);
        InputLeftPanel.add(bOne);
        InputLeftPanel.add(bTwo);
        InputLeftPanel.add(bThree);
        InputLeftPanel.add(bZero);
        InputLeftPanel.add(bEqual);
        InputLeftPanel.add(bPoint);

        JButton bClear =new JButton("C");
        CButton bPlus = new CButton("+");
        CButton bSubtract = new CButton("-");
        CButton bMultiply = new CButton("*");
        CButton bDivide = new CButton("/");

        InputRightPanel.setLayout(new GridLayout(5,1));
        InputRightPanel.add(bClear);
        InputRightPanel.add(bPlus);
        InputRightPanel.add(bSubtract);
        InputRightPanel.add(bMultiply);
        InputRightPanel.add(bDivide);

        this.setLayout(new BorderLayout());
        this.add(InputLeftPanel,BorderLayout.CENTER);
        this.add(InputRightPanel, BorderLayout.EAST);

        bEqual.addActionListener(new ComputeListener());
        bClear.addActionListener(new ClearListener());
    }


    public static void main(String[] args) {
        GUIUtil.showPanel(InputPanel.instance);
    }
}
