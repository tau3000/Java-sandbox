package ramda.numeral;

import java.util.function.Consumer;

public class Printer {
    
    public void print(final Consumer<Context> builder){
        System.out.println(Context.create(builder));
    }
}
