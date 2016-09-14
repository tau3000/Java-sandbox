package factorymethod;

import lombok.Getter;
import lombok.Setter;

public abstract class AbstractCell<T> {
    @Getter protected int row;
    @Getter protected int col;
    @Getter @Setter protected T value;
}
