package abstractfactory;

// ConcreteProduct
public class DealPageBottom extends PageBottom {
    public DealPageBottom(String name) {
        super(name);
    }

    public String get() {
        return appendH2Tag(name);
    }
}
