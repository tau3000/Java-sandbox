package ramda.numeral;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(new PositiveNumber(new Integer(3)), new Hon(), Expression.MARU);
        printer.print();
    }
}
