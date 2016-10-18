package visitor;

public abstract class Visitor {
    public abstract void visit(BaseCurrency baseCurrency);

    public abstract void visit(Region region);

    public abstract void visit(CurrencyConversion currencyConversion);
}
