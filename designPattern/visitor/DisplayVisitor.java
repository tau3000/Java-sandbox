package visitor;

import java.util.Iterator;

public class DisplayVisitor extends Visitor {

    @Override
    public void visit(BaseCurrency baseCurrency) {
        System.out.println(baseCurrency.getName());
        Iterator<Entry> it = baseCurrency.itrator();
        while (it.hasNext()) {
            final Entry entry = it.next();
            entry.accept(this);
        }
    }

    @Override
    public void visit(Region region) {
        System.out.println(region.getName());
        Iterator<Entry> it = region.itrator();
        while (it.hasNext()) {
            final Entry entry = it.next();
            entry.accept(this);
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
