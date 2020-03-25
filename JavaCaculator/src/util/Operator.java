package util;

public enum Operator{
    PLUS('+',"+"),
    SUBTRACT('-',"-"),
    MULTIPLY('*',"*"),
    DIVIDE('/',"/"),
    LEFT_PARENTHESES('(',"("),
    RIGHT_PARENTHESES(')',")"),
    CLEAR('C',"C");
    private char  symbolChar;

    private String symbol;
    private Operator(char symbolChar,String symbol){
        this.symbolChar= symbolChar;
        this.symbol=symbol;
    }
    public char getSymbolChar(){return this.symbolChar;}
    public String getSymbol() {
        return this.symbol;
    }
}
