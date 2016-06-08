package ramda.numeral;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(new PositiveNumber<>(3), CounterSuffix.Hon, Expression.MARU);
        printer.print();
    }
}
