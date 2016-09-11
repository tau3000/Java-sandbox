package iterator;

import lombok.Getter;
import lombok.Setter;

public class Cell {
    @Getter @Setter private String value;

    public Cell(String s) {
        this.value = s;
    }
}
