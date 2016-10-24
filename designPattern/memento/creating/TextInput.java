package memento.creating;

import lombok.Getter;

public class TextInput {
    @Getter private String text = "";

    public Memento createMemento() {
        return new Memento(text);
    }

    public void input(String string) {
        text += string;
    }

    public void restoreMemento(Memento memento) {
        text = memento.getText();
    }
}
