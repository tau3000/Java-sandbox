package abstractfactory;

public abstract class PageBottom {
    protected String name;

    public PageBottom(String name) {
        this.name = name;
    }

    public abstract String get();

    protected String appendH2Tag(String name) {
        return "<h2>" + name + "</h2>";
    }
}
