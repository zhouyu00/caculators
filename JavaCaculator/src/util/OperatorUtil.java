package util;

public class OperatorUtil {
    public static boolean isMulOrDiv(char op){
        return op==Operator.MULTIPLY.getSymbolChar()||op==Operator.DIVIDE.getSymbolChar();
    }
    public static boolean isMulOrDiv(String op){
        return op.equals(Operator.MULTIPLY.getSymbol())||op.equals(Operator.DIVIDE.getSymbol());
    }

    public static boolean isPlusOrSub(char op){
        return op==Operator.PLUS.getSymbolChar()||op==Operator.SUBTRACT.getSymbolChar();
    }
    public static boolean isPlusOrSub(String op){
        return op.equals(Operator.PLUS.getSymbol())||op.equals(Operator.SUBTRACT.getSymbol());
    }

    public static boolean isRightParentheses(char op){
        return op==Operator.RIGHT_PARENTHESES.getSymbolChar();
    }
    public static boolean isRightParentheses(String op){
        return op.equals(Operator.RIGHT_PARENTHESES.getSymbol());
    }

    public static boolean isLeftParentheses(char op){
        return op==Operator.LEFT_PARENTHESES.getSymbolChar();
    }
    public static boolean isLeftParentheses(String op){
        return op.equals(Operator.LEFT_PARENTHESES.getSymbol());
    }

    public static boolean isParentheses(char op){
        return isRightParentheses(op)||isLeftParentheses(op);
    }
    public static boolean isParentheses(String op){
        return isRightParentheses(op)||isLeftParentheses(op);
    }
}
