package memento;

import java.util.ArrayList;
import java.util.List;

import memento.creating.Memento;
import memento.creating.TextInput;

public class Main {

    public static void main(String[] args) {
        List<Memento> mementos = new ArrayList<>();
        final TextInput textInput = new TextInput();

        textInput.input("はじめの");
        display(textInput);
        mementos.add(textInput.createMemento());

        textInput.input("第一歩。");
        display(textInput);
        mementos.add(textInput.createMemento());

        textInput.input("だるま");
        display(textInput);

        textInput.restoreMemento(removeLast(mementos)); // 戻す
        display(textInput);

         textInput.restoreMemento(removeLast(mementos)); // 戻す
         display(textInput);
    }

    private static Memento removeLast(List<Memento> mementos) {
        return mementos.remove(mementos.size() - 1);
    }

    private static void display(final TextInput textInput) {
        System.out.println(textInput.getText());
    }

}
