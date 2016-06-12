package ramda.numeral;

public class Degree implements CounterSuffix {
    
    private static final String degree = "度";
    private Number number;
    
    public Degree(Number number) {
        this.number = number;
    }
    
    @Override
    public boolean isOnlyPositive() {
        return true;
    }
    
    @Override
    public String toString() {
        return number.toString() + degree;
    }

}
