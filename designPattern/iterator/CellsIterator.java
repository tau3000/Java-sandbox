package iterator;

public class CellsIterator implements Iterator {
    private Cells cells;
    private int index = 0;

    public CellsIterator(Cells cells) {
        this.cells = cells;
    }

    public boolean hasNext() {
        if (index < cells.getSize()) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        return cells.getCellAt(index++);
    }
}
