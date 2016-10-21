package facade;

import java.util.ArrayList;
import java.util.stream.IntStream;

import lombok.Getter;

public class CachedProperties {
    @Getter private String name;
    @Getter private ArrayList<Integer> data;

    public CachedProperties() {
        // サンプル
        name = "国債金利";
        data = new ArrayList<>();
        IntStream.rangeClosed(0, 20).forEach(i -> data.add(i));
    }
}
