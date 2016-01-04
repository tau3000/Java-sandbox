package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<Ramen> ramens = new ArrayList<Ramen>();
    public void addRamen(Ramen ramen) {
        ramens.add(ramen);
    }
    public int getSize() {
        return ramens.size();
    }
    public Ramen getRamenAt(int index) {
        return (Ramen) ramens.get(index);
    }
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}