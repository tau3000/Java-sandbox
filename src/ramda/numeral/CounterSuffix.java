package ramda.numeral;

public enum CounterSuffix {
    Hon("本", true), Do("度", false);

    private final String s;
    private final boolean hasPositive;

    private CounterSuffix(String s, boolean hasPositive) {
        this.s = s;
        this.hasPositive = hasPositive;
    }

    public void print() {
        System.out.print(s);
    }

    public boolean isOnlyPositive() {
        return hasPositive;
    }
}
