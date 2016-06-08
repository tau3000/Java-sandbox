package ramda.numeral;

public class Printer {
    private Number<?> number;
    private CounterSuffix counterSuffix;
    private Expression expression;

    public Printer(Number<?> number, CounterSuffix counterSuffix, Expression expression) {
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
        number.print();
        counterSuffix.print();
        expression.print();
        System.out.println("");
    }
}
