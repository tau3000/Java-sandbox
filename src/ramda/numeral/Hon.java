package ramda.numeral;

public class Hon extends CounterSuffix {
    private static final String hon = "本";
    
    public Hon(Number number) {
        this.number = number;
        if(number.doubleValue() < 0){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean isOnlyPositive() {
        return false;
    }

    @Override
    public String toString() {
        return number.toString() + hon;
    }
}
