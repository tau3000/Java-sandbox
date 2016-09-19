package abstractfactory;

// target class
public class Page {
    private String contents;
    private PageTop pageTop;
    private PageBottom pageBottom;

    public Page(String title) {
        this.contents = title;
    }

    public void addTop(PageTop pageTop) {
        this.pageTop = pageTop;
    }

    public void addBottom(PageBottom pageBottom) {
        this.pageBottom = pageBottom;
    }

    public String getHtml() {
        return pageTop.get() + contents + pageBottom.get();
    }
}
