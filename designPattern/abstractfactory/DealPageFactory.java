package abstractfactory;

// Factory
public class DealPageFactory extends AbstractFactory {
    public PageTop getTop() {
        return new DealPageTop("M&A: M&A案件を探す");
    }

    public PageBottom getBottom() {
        return new DealPageBottom("M&Aに関する情報はこちら");
    }
}
