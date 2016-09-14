package factorymethod;


public class DefaultCellFactory extends AbstractFactory<String>{
    @Override
    void setCellOption(Cell<String> cell) {
        Option option = null;
        cell.addOption(option);
    }
}