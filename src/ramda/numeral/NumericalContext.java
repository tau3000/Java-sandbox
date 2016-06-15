/**
 * Fluent Builderを参考に作成
 * http://qiita.com/disc99/items/840cf9936687f97a482b
 */
package ramda.numeral;

import java.util.function.Consumer;

public class NumericalContext {
    private NumericalContext() {
    }

    private CounterSuffix counterSuffix;
    private Expression expression;

    public NumericalContext counterSuffix(CounterSuffix counterSuffix) {
        this.counterSuffix = counterSuffix;
        return this;
    }

    public NumericalContext expression(Expression expression) {
        this.expression = expression;
        return this;
    }
    
    public static String create(final Consumer<NumericalContext> builder) {
        NumericalContext context = new NumericalContext();
        builder.accept(context);
        if (context.counterSuffix == null) {
            throw new NullPointerException();
        }
        if (context.expression == null) {
            return context.counterSuffix.toString();
        } else {
            return context.counterSuffix.toString() + context.expression.toString();
        }
    }
}
