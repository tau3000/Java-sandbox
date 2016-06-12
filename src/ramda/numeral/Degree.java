package ramda.numeral;

public class Degree extends CounterSuffix {
    
    private static final String degree = "度";
    
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
