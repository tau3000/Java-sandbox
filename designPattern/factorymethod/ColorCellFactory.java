package factorymethod;

public class ColorCellFactory<T> extends AbstractFactory<T> {
    private String color;

    public ColorCellFactory(String color) {
        this.color = color;
    }
    
    @Override
    void setCellOption(Cell<T> cell) {
        Option option = new Option(color);
        cell.addOption(option);
    }
}
