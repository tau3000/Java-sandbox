package ramda.numeral;

public enum Expression {
    MARU("。"), DESU("です");

    private final String s;

    private Expression(String s) {
        this.s = s;
    }
    
    @Override
    public String toString() {
        return s;
    }
}
