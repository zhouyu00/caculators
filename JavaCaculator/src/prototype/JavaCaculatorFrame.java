package prototype;

import jdk.internal.util.xml.impl.Input;
import util.ColorUtil;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;


public class JavaCaculatorFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBackground(ColorUtil.whiteColor);
        frame.setSize(400,500);

        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        JPanel ShowPanel = new JPanel();
        JPanel InputPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(ShowPanel,BorderLayout.NORTH);
        mainPanel.add(InputPanel,BorderLayout.CENTER);

        JPanel InputLeftPanel = new JPanel();
        JPanel InputRightPanel = new JPanel();
        InputPanel.setLayout(new BorderLayout());
        InputPanel.add(InputLeftPanel,BorderLayout.CENTER);
        InputPanel.add(InputRightPanel,BorderLayout.EAST);

        JTextField tf = new JTextField();
        ShowPanel.setPreferredSize(new Dimension(400,100));
        tf.setPreferredSize(new Dimension(400,100));
        tf.setColumns(15);
        tf.setFont(new Font("微软雅黑",Font.BOLD,25));
        ShowPanel.add(tf);

        //Number
        JButton bZero = new JButton("0");
        JButton bOne = new JButton("1");
        JButton bTwo = new JButton("2");
        JButton bThree = new JButton("3");
        JButton bFour = new JButton("4");
        JButton bFive = new JButton("5");
        JButton bSix = new JButton("6");
        JButton bSeven = new JButton("7");
        JButton bEight = new JButton("8");
        JButton bNine = new JButton("9");

        JButton blParentheses = new JButton("(");
        JButton brParentheses = new JButton(")");
        JButton bPercent = new JButton("%");
        JButton bEqual = new JButton("=");
        JButton bPoint = new JButton(".");

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


        JButton bPlus = new JButton("+");
        JButton bSubtract = new JButton("-");
        JButton bMultiply = new JButton("*");
        JButton bDivide = new JButton("/");

        InputRightPanel.setLayout(new GridLayout(4,1));
        InputRightPanel.add(bPlus);
        InputRightPanel.add(bSubtract);
        InputRightPanel.add(bMultiply);
        InputRightPanel.add(bDivide);


        frame.setContentPane(mainPanel);
        frame.setVisible(true);
    }


}
