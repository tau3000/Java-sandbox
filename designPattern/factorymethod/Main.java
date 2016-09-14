package factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DefaultCellFactory defaultCellFactory = new DefaultCellFactory();
        WarningIntegerCellFactory warningIntegerCellFactory = new WarningIntegerCellFactory();

        List<Cell> cells = new ArrayList<>();
        cells.add(defaultCellFactory.create(1, 1, "default"));
        cells.add(warningIntegerCellFactory.create(1, 2, 1));
    }
}
