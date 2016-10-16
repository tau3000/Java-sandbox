package abstractfactory;

public class PageCreator {
    private AbstractPageFactory pageFactory;
    private String pageName;

    public PageCreator(AbstractPageFactory pageFactory, String pageName) {
        this.pageFactory = pageFactory;
        this.pageName = pageName;
    }

    public String getHtml() {
        Page page = new Page(pageName);
        page.addTop(pageFactory.createTop());
        page.addBottom(pageFactory.createBottom());
        return page.toHtml();
    }
}
