package ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        List<Supplier<String>> list= Arrays.asList(() -> "本", () -> "冊", () -> "個");
        Provider provider = new Provider(list);
        
        BiFunction<Integer, String, String> bi = (num, word) -> String.valueOf(num) + word;
        for(int i=0; i<provider.size(); i++){
            System.out.println(bi.apply(i, provider.call(i)));
        }
    }
}
