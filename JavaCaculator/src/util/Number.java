package util;

public enum Number {
    Zero('0',"0"),
    One('1',"1"),
    Two('2',"2"),
    Three('3',"3"),
    Four('4',"4"),
    Five('5',"5"),
    Six('6',"6"),
    Seven('7',"7"),
    Eight('8',"8"),
    Nine('9',"9");
    private char symbolChar;
    private String symbol;
    Number(char symbolChar,String symbol){
        this.symbolChar = symbolChar;
        this.symbol=symbol;
    }
    public char getSymbolChar(){
        return symbolChar;
    }
    public String getSymbol() {
        return symbol;
    }
}
