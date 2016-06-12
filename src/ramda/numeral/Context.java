/**
 * Fluent Builderを参考に作成
 * http://qiita.com/disc99/items/840cf9936687f97a482b
 */
package ramda.numeral;

import java.util.function.Consumer;

public class Context {
    private Context() {
    }

    private Number number;
    private CounterSuffix counterSuffix;
    private Expression expression;

    public Context number(Number number) {
        this.number = number;
        return this;
    }

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
        if (context.number == null || context.counterSuffix == null) {
            throw new NullPointerException();
        }
        checkPositiveValue(context);
        if (context.expression == null) {
            System.out.println(context.number.toString() + context.counterSuffix.toString());
        } else {
            System.out.println(context.number.toString() + context.counterSuffix.toString() + context.expression.toString());
        }
    }

    private static void checkPositiveValue(Context context) {
        //0または正の数しか許可しない時に負の数が入っていた場合
        if(! context.counterSuffix.isOnlyPositive()){
            if(context.number.doubleValue() < 0){
                throw new IllegalStateException();
            }
        }
    }
}
