package factorymethod;

import java.lang.Integer;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public abstract class ListPrinter {
    public void printList(List<Integer> list) {
        Comparator<Integer> comparator = createComparator();
        list = new ArrayList<Integer>(list);

        Collections.sort(list, comparator);

        list.stream().forEach( item -> {
            System.out.println(item);
        });
    }

    protected abstract Comparator<Integer> createComparator();
}