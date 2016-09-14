package factorymethod;

public class WarningIntegerCellFactory extends AbstractFactory<Integer> {
    @Override
    void setCellOption(Cell<Integer> cell) {
        Option option = new Option("Red");
        cell.addOption(option);
    }
}
