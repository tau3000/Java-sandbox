package abstractfactory;

// Factory
public class CompanyPageFactory extends AbstractPageFactory {
    public PageTop createTop() {
        return new DealPageaTop("Company: 企業を探す");
    }

    public PageBottom createBottom() {
        return new CompanyPageBottom("企業に関する情報はこちら");
    }
}
