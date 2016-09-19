package abstractfactory;

// ConcreteProduct
public class DealPageTop extends PageTop {
    public DealPageTop(String name) {
        super(name);
    }

    public String get() {
        return appendH1Tag(name);
    }
}
