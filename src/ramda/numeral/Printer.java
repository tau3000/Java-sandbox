package ramda.numeral;

public class Printer {
    private PositiveNumber number;
    private CounterSuffix counterSuffix;
    private Expression expression;

    public Printer(PositiveNumber number, CounterSuffix counterSuffix, Expression expression) {
        this.number = number;
        this.counterSuffix = counterSuffix;
        this.expression = expression;
    }

    public void print() {
        if (counterSuffix.isOnlyPositive() == true) {
            if (number.isPositive() == false) {
                throw new IllegalStateException();
            }
        }
        System.out.println(number.toString() + counterSuffix.toString() + expression.toString());
    }
    
    @Override
    public String toString() {
        return number.toString() + counterSuffix.toString() + expression.toString();
    }
}
