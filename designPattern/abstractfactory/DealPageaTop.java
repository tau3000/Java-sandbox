package abstractfactory;

// ConcreteProduct
public class DealPageaTop extends PageTop {
    public DealPageaTop(String name) {
        super(name);
    }

    public String get() {
        return appendH1Tag(name);
    }
}
