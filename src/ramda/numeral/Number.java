package ramda.numeral;

/**
 * @author yoshihiro_ueki
 * @param <T>
 */
public class Number<T> {
    protected T number;

    public Number(T number) {
        if (!(number.getClass() == Integer.class || number.getClass() == Double.class)) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public void print() {
        System.out.print(number);
    }
}
