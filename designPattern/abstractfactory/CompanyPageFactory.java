package abstractfactory;

// Factory
public class CompanyPageFactory extends AbstractFactory {
    public PageTop getTop() {
        return new DealPageaTop("Company: 企業を探す");
    }

    public PageBottom getBottom() {
        return new CompanyPageBottom("企業に関する情報はこちら");
    }
}
