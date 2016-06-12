package ramda.numeral;

public class PositiveNumber extends Number {
    private static final long serialVersionUID = 1L;

    // 0または正の整数
    private int number;

    public PositiveNumber(int number) {
        setNumber(number);
    }

    public PositiveNumber(Number number) {
        setNumber(number.intValue());
    }

    public void setNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isPositive() {
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    @Override
    public int intValue() {
        return number;
    }

    @Override
    public long longValue() {
        return number;
    }

    @Override
    public float floatValue() {
        return number;
    }

    @Override
    public double doubleValue() {
        return number;
    }
}
