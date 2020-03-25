package util;

public class ParseUtil {
    public static boolean isOperator(String c){
        for(Operator op:Operator.values()){
            if(c==op.getSymbol())
                return true;
        }
        return false;
    }
    public static boolean isOperator(char c){
        for(Operator op:Operator.values()){
            if(c==op.getSymbolChar())
                return true;
        }
        return false;
    }

    public static boolean isNumber(String c){
        for(Number n:Number.values()){
            if(c==n.getSymbol())
                return true;
        }
        return  false;
    }
    public static boolean isNumber(char c){
        for(Number n:Number.values()){
            if(c==n.getSymbolChar())
                return true;
        }
        return  false;
    }
}
