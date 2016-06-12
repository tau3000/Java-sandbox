package ramda.numeral;

public class Hon implements CounterSuffix {
    private static final String hon = "本";

    @Override
    public boolean isOnlyPositive() {
        return false;
    }

    @Override
    public String toString() {
        return hon;
    }
}
