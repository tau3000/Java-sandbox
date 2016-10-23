package visitor;

import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();
    public abstract Iterator<Entry> itrator();
}
