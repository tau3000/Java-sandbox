package abstractfactory;

// Factory
public class DealPageFactory extends AbstractFactory {
    public PageTop createTop() {
        return new DealPageTop("M&A: M&A案件を探す");
    }

    public PageBottom createBottom() {
        return new DealPageBottom("M&Aに関する情報はこちら");
    }
}
