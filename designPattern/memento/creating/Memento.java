package memento.creating;

import lombok.Getter;

public class Memento {
    @Getter private String text;

    Memento(String text) {
        this.text = text;
    }
}
