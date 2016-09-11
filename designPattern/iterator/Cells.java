package iterator;

import java.util.ArrayList;
import java.util.List;

public class Cells implements Aggregate {
    protected List<Cell> cells = new ArrayList<Cell>();

    public void addCell(Cell cell) {
        cells.add(cell);
    }

    public int getSize() {
        return cells.size();
    }

    public Cell getCellAt(int index) {
        return cells.get(index);
    }

    public Iterator iterator() {
        return new CellsIterator(this);
    }
}
