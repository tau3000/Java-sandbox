package visitor;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.Getter;

public class Region extends Entry {
    @Getter private String name;
    private ArrayList<Entry> list = new ArrayList<>();

    public Region(String name) {
        this.name = name;
    }

    public void add(Entry entry) {
        list.add(entry);
    }
    
    @Override
    public void accept(Visitor v) {
        // visit(Region)が呼び出される
        v.visit(this);
    }
    
    public Iterator<Entry> itrator() {
        return list.iterator();
    }
}
