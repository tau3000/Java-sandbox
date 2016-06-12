package ramda.numeral;

public class Degree implements CounterSuffix {
    
    private static final String degree = "度";
    @Override
    public boolean isOnlyPositive() {
        return true;
    }
    
    @Override
    public String toString() {
        return degree;
    }

}
