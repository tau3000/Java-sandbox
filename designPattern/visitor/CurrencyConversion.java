package visitor;

import lombok.Getter;

public class CurrencyConversion extends Entry {
    @Getter private String name;
    @Getter private boolean isChecked = false;

    public CurrencyConversion(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor v) {
        // visit(CurrencyConversion)が呼び出される
        v.visit(this);
    }

    public void checked() {
        isChecked = true;
    }

    public void unchecked() {
        isChecked = false;
    }
}
