package ramda.numeral;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NumberTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Test
    public void Integerの出力ができること() {
        Number<Integer> number = new Number<>(3);
        number.print();
    }
    
    @Test
    public void Doubleの出力ができること() {
        Number<Double> number = new Number<>(new Double(3.0));
        number.print();
    }
    
    @Test
    public void Stringの出力はできないこと() {
        thrown.expect(IllegalArgumentException.class);
        Number<String> number = new Number<String>("String");
        number.print();
    }
}
