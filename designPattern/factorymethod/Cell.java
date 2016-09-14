package factorymethod;

public class Cell<T> extends AbstractCell {

    private Option option;

    public Cell(int row, int col, T value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public void addOption(Option option) {
        this.option = option;
    }
}
