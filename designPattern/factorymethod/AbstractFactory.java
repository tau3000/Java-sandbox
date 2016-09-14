package factorymethod;

public abstract class AbstractFactory<T> {

    public Cell<T> create(int row, int col, T value) {
        final Cell<T> cell = new Cell<T>(row, col, value);
        setCellOption(cell);
        return cell;
    }

    abstract void setCellOption(Cell<T> cell);
}
