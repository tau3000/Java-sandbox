/**
 * Fluent Builderを参考に作成
 * http://qiita.com/disc99/items/840cf9936687f97a482b
 */
package ramda.numeral;

import java.util.function.Consumer;

public class Context {
    private Context() {
    }

    private CounterSuffix counterSuffix;
    private Expression expression;

    public Context counterSuffix(CounterSuffix counterSuffix) {
        this.counterSuffix = counterSuffix;
        return this;
    }

    public Context expression(Expression expression) {
        this.expression = expression;
        return this;
    }

    public static void print(final Consumer<Context> builder) {
        Context context = new Context();
        builder.accept(context);
        if (context.counterSuffix == null) {
            throw new NullPointerException();
        }
        if (context.expression == null) {
            System.out.println(context.counterSuffix.toString());
        } else {
            System.out.println(context.counterSuffix.toString() + context.expression.toString());
        }
    }
}
