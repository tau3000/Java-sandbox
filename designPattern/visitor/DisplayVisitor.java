package visitor;

import java.util.Iterator;

public class DisplayVisitor extends Visitor {

    @Override
    public void visit(BaseCurrency baseCurrency) {
        acceptCurrency(baseCurrency);
    }

    @Override
    public void visit(Region region) {
        acceptCurrency(region);
    }

    private void acceptCurrency(Entry entry) {
        System.out.println(entry.getName());
        Iterator<Entry> it = entry.itrator();
        while (it.hasNext()) {
            final Entry e = it.next();
            e.accept(this);
        }
    }

    @Override
    public void visit(CurrencyConversion currencyConversion) {
        System.out.print(currencyConversion.getName() + " : ");
        if (currencyConversion.isChecked()) {
            System.out.println("チェックボックスON");
        } else {
            System.out.println("チェックボックスOFF");
        }
    }
}
