package ramda.numeral;

public class Hon extends CounterSuffix {
    private static final String hon = "本";
    
    public Hon(Number number) {
        if(number == null || number.doubleValue() < 0){
            throw new IllegalArgumentException();
        }
        this.number = number.intValue();
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
