package badramda;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<? extends Expresstion> list = Arrays.asList(new Hon(), new Satu(), new Ko());
        for(Expresstion e : list){
            System.out.println(e.call(list.indexOf(e)));
        }
    }
}
