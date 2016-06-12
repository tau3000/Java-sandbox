package ramda.numeral;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<Context> builder = (context) -> context.number(new Integer(-30))
                                                        .counterSuffix(new Degree())
                                                        .expression(Expression.DESU);
        Context.print(builder);
    }
}
