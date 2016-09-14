package factorymethod;

public class DefaultCellFactory<T> extends AbstractFactory<T> {
    @Override
    void setCellOption(Cell<T> cell) {
        Option option = null;
        cell.addOption(option);
    }
}
