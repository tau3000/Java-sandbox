package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

import lombok.Getter;

public class BaseCurrency extends Entry {
    @Getter private String name;
    private ArrayList<Entry> list = new ArrayList<>();

    public BaseCurrency(String name) {
        this.name = name;
    }

    public Entry add(Entry entry) {
        list.add(entry);
        return this;
    }
    
    @Override
    public void accept(Visitor v) {
        // visit(BaseCurrency)が呼び出される
        v.visit(this);
    }

    public void apply(Function<Entry, Void> s) {
        list.stream().map(e -> s.apply(e));
    }

    public Iterator<Entry> itrator() {
        return list.iterator();
    }
}
