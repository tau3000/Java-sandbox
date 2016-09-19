package abstractfactory;

// ConcreteProduct
public class CompanyPageBottom extends PageBottom {
    public CompanyPageBottom(String name) {
        super(name);
    }

    public String get() {
        return appendH2Tag(name) + addSupplemental();
    }

    private String addSupplemental() {
        return "<p>※業界名中の*はアルゴリズムによる自動業界選定であることを意味します。</p>";
    }
}
