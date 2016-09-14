package factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DefaultCellFactory<String> defaultCellFactory = new DefaultCellFactory<>();
        ColorCellFactory<Integer> warningIntegerCellFactory = new ColorCellFactory<>("Red");

        @SuppressWarnings("rawtypes") List<Cell> cells = new ArrayList<>();
        cells.add(defaultCellFactory.create(1, 1, "default"));
        cells.add(warningIntegerCellFactory.create(1, 2, 1));
    }
}
