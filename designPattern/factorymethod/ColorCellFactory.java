package factorymethod;

import lombok.Getter;
import lombok.Setter;

public class ColorCellFactory<T> extends AbstractFactory<T> {
    @Setter @Getter private String color;

    public ColorCellFactory(String color) {
        this.color = color;
    }

    @Override
    void setCellOption(Cell<T> cell) {
        Option option = new Option(color);
        cell.addOption(option);
    }
}
