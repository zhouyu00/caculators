package gui.listener;

import gui.panel.ShowPanel;
import util.ComputeUtil;
import util.Operator;
import util.OperatorUtil;
import util.ParseUtil;

import javax.print.attribute.standard.NumberUp;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ComputeListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField tf = (JTextField) ShowPanel.instance.getComponent(0);
        String content = tf.getText();
        String answer = getAnswer(content);
        tf.setText(answer);
    }
    private void travelLinkedList(LinkedList<String> list){
        System.out.println("-----------travel----------------");
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i));
        System.out.println();
    }

    private String getAnswer(String equation){
        LinkedList<String> rpExpression = new LinkedList<>();
        Stack<String> opStack = new Stack<>();
        //算式分割
        ArrayList<String> equations = parseToStringArray(equation);
        //转换为逆波兰式，并放入队列中
        parseToReversePolishExpression(equations,rpExpression,opStack);
        travelLinkedList(rpExpression);
        //计算最终结果
        return compute(rpExpression);
    }

    private ArrayList<String> parseToStringArray(String equation){
        char[] eqChars = equation.toCharArray();
        ArrayList<String> equations = new ArrayList<>();
        /*

        1.碰见数字
            直接往里放，继续加入
        2.碰见加减
            1.上一个字符是数字或者右括号，组成String直接加入list
            2.上一个字符是加减乘除或者左括号，继续加入
        3.碰见乘除
            直接加入组成String，加入list
        4.碰见括号
            直接组成String，加入list
         */
        StringBuilder sb = new StringBuilder();
        char lastct='\0';
        for(int i=0;i<equation.length();i++){
            char ct = eqChars[i];
            if(ParseUtil.isNumber(ct)||
                    (OperatorUtil.isPlusOrSub(ct)&&
                            ParseUtil.isOperator(lastct)&&!OperatorUtil.isRightParentheses(lastct)))
            {
                sb.append(ct);
            }
//            if(OperatorUtil.isMulOrDiv(ct)||OperatorUtil.isParentheses(ct)
//            ||(OperatorUtil.isPlusOrSub(ct)&&(ParseUtil.isNumber(lastct)||OperatorUtil.isRightParentheses(lastct))))

            else{
                if(sb.length()!=0)equations.add(sb.toString());
                equations.add(String.valueOf(ct));
                sb= new StringBuilder();
            }
            lastct=ct;
        }
        if(sb.length()!=0)equations.add(sb.toString());
        return equations;
    }

    private void parseToReversePolishExpression(ArrayList<String> equations,LinkedList<String> rpExpression,Stack<String> opStack)
    {
        /*
         原有形式转逆波兰形式分析如下：

         -数字：
            直接进入队列
         -符号：
            - 左括号：直接入栈
            - 右括号：
            - 加减：
              加减号比一切符号优先级都低
              循环判断栈顶入队列，直到 栈为空，左括号停止，将加减号入栈
            - 乘除：
              乘除号只比乘除优先级低
              循环判断栈顶，直到栈为空，左括号，加减号，将乘除号入栈
         */
        System.out.println("--------------parse---------------");
         for(int i=0;i<equations.size();i++){
             String cur = equations.get(i);
             System.out.println(cur);
             try {
                 int t  = Integer.parseInt(cur);
                 rpExpression.offerLast(String.valueOf(cur));
             } catch (NumberFormatException e) {
                 if(OperatorUtil.isLeftParentheses(cur)) {
                     opStack.push(String.valueOf(cur));
                 }
                 if(OperatorUtil.isRightParentheses(cur)){
                     while(!opStack.isEmpty()&&!OperatorUtil.isLeftParentheses(opStack.peek())){
                         rpExpression.offerLast(opStack.pop());
                     }
                     if(OperatorUtil.isLeftParentheses(opStack.peek()))opStack.pop();
                 }
                 if(OperatorUtil.isPlusOrSub(cur)){
                     while(!opStack.isEmpty()&&!OperatorUtil.isLeftParentheses(opStack.peek())){
                         rpExpression.offerLast(opStack.pop());
                     }
                     opStack.push(String.valueOf(cur));
                 }
                 if(OperatorUtil.isMulOrDiv(cur)){
                     while(!opStack.isEmpty()&&!OperatorUtil.isLeftParentheses(opStack.peek())&&!OperatorUtil.isPlusOrSub(opStack.peek())){
                         rpExpression.offerLast(opStack.pop());
                     }
                     opStack.push(String.valueOf(cur));
                 }
             }
         }
         while(!opStack.isEmpty())rpExpression.offerLast(opStack.pop());
    }

    private String compute(LinkedList<String> rpExpression){
        System.out.println("-----------compute-----------");
        System.out.println(rpExpression.isEmpty());
        Stack<String> s = new Stack<>();
        while(!rpExpression.isEmpty()){
            String cs = rpExpression.pollFirst();
            System.out.println(cs);
            try {
                int t = Integer.parseInt(cs);
                s.push(cs);
            } catch (NumberFormatException e) {
                int b = Integer.parseInt(s.pop());
                int a = Integer.parseInt(s.pop());
                int res = ComputeUtil.compute(a,b,cs.charAt(0));
                s.push(String.valueOf(res));
            }
        }
        return s.pop();
    }

    public static void main(String[] args) {
        String str = "10+(7+2*8)--2";
        ComputeListener ts = new ComputeListener();
        List<String> eq = ts.parseToStringArray(str);
        for(int i=0;i<eq.size();i++){
            System.out.println(eq.get(i));
        }
    }
}
