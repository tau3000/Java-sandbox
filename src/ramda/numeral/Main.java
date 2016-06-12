package ramda.numeral;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        
        // -30度です
        Consumer<Context> builder = (context) -> context.counterSuffix(new Degree(new Integer(-30))).expression(Expression.DESU);
        printer.print(builder);

        // 10本 expressionはnullでも文章になるので可
        Consumer<Context> builder2 = (context) -> context.counterSuffix(new Hon(new Integer(10)));
        printer.print(builder2);

        // -10本です 負の数を許可しない単位の時はException
        try {
            Consumer<Context> builder3 = (context) -> context.counterSuffix(new Hon(new Integer(-10))).expression(Expression.DESU);
            printer.print(builder3);
        } catch (IllegalArgumentException iae) {
            System.out.println("「-10本です」のような表現はできません");
//            iae.printStackTrace();
        }
    }
}
