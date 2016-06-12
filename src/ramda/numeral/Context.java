/**
 * Fluent Builderを参考に作成
 * http://qiita.com/disc99/items/840cf9936687f97a482b
 */
package ramda.numeral;

import java.util.function.Consumer;

public class Context {
    private Context(){
    }
    
    private Number number;
    private CounterSuffix counterSuffix;
    private Expression expression;

    Context number(Number number) {
        this.number = number;
        return this;
    }
    
    Context counterSuffix(CounterSuffix counterSuffix) {
        this.counterSuffix = counterSuffix;
        return this;
    }
    Context expression(Expression expression) {
        this.expression = expression;
        return this;
    }

   static void print(final Consumer<Context> builder) {
       Context context = new Context();
        builder.accept(context);
        if (context.number == null || context.counterSuffix == null) {
            throw new NullPointerException();
        }
        System.out.println(context.number.toString() + context.counterSuffix.toString() + context.expression.toString());
    }
}
