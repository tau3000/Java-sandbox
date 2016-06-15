package ramda.numeral;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NumberTest {
    @Rule public ExpectedException thrown = ExpectedException.none();

    @Test
    public void HonクラスがDoubleの値を与えられてもIntegerの出力ができること() {
        Hon hon = new Hon(new Double(10.0));
        assertThat(hon.toString(), equalTo("10本"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void Honクラスにnullが与えられるとExceptionを出すこと() {
        Hon hon = new Hon(null);
        hon.toString();
    }

    @Test
    public void DegreeクラスがFloatの値を与えられてもIntegerの出力ができること() {
        Degree degree = new Degree(new Float(20.0));
        assertThat(degree.toString(), equalTo("20度"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void Degreeクラスにnullが与えられるとExceptionを出すこと() {
        Degree degree = new Degree(null);
        degree.toString();
    }

    @Test
    public void NumericalContextで文章が構築できること() {
        assertThat(
            NumericalContext.create((context) -> context.counterSuffix(new Degree(new Integer(-30))).expression(Expression.DESU)),
            equalTo("-30度です"));
    }
}
