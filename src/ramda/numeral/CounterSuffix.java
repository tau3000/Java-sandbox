package ramda.numeral;

public enum CounterSuffix {
    Hon("本"),
    Ko("個");
    
    private final String s;
    
    private CounterSuffix(String s) {
        this.s = s;
    }
    
    public void print(){
        System.out.print(s);
    }
}
