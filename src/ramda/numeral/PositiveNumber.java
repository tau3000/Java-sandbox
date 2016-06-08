package ramda.numeral;

public class PositiveNumber<T> extends Number<T>{

    public PositiveNumber(T number) {
        super(number);
        if (!(number.getClass() == Double.class)) {
            throw new IllegalArgumentException();
        }
        if ((int)number <= 0) {
            throw new IllegalArgumentException();
        }
    }
    
    public void print(){
        System.out.print(number);
    }
}
