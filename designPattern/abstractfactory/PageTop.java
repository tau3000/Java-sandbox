package abstractfactory;

// AbstractProduct
public abstract class PageTop {
    protected String name;

    public PageTop(String name) {
        this.name = name;
    }

    public abstract String get();

    protected String appendH1Tag(String name) {
        return "<h1>" + name + "</h1>";
    }
}
