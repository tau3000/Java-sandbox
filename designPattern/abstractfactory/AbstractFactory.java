package abstractfactory;

// Factory
public abstract class AbstractFactory {
    public static AbstractFactory getFactroy(String factoryName) {
        switch (factoryName) {
        case "Company":
            return new CompanyPageFactory();
        case "M&A":
            return new DealPageFactory();
        default:
            throw new IllegalArgumentException();
        }
    }

    public abstract PageTop createTop();

    public abstract PageBottom createBottom();
}
