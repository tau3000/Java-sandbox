package ramda.numeral;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        // -30度です
        Consumer<Context> builder = (context) -> context.number(new Integer(-30)).counterSuffix(new Degree()).expression(Expression.DESU);
        Context.print(builder);

        // 10本 expressionはnullでも文章になるので可
        Consumer<Context> builder2 = (context) -> context.number(new Integer(10)).counterSuffix(new Hon());
        Context.print(builder2);

        // -10本です 負の数を許可しない単位の時はException
        try {
            Consumer<Context> builder3 = (context) -> context.number(new Integer(-10)).counterSuffix(new Hon());
            Context.print(builder3);
        } catch (IllegalStateException ise) {
            System.out.println("「-10本です」のような表現はできません");
//            ise.printStackTrace();
        }
    }
}
