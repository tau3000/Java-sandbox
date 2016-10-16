package factorymethod;

import lombok.Getter;

public class Cell<T> extends AbstractCell<T> {
    @Getter private Option option;

    public Cell(int row, int col, T value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    // Cellのオプションが指定できるパターンのコンストラクタを追加したほうがいい
    public void addOption(Option option) {
        this.option = option;
    }
}
