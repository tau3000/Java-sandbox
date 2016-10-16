package abstractfactory;

public class Main {

    public static void main(String[] args) {
        final PageCreator pageCreator1 = new PageCreator(AbstractPageFactory.getFactroy("Company"), "Company Pageの内容");
        System.out.println(pageCreator1.getHtml());

        final PageCreator pageCreator2 = new PageCreator(AbstractPageFactory.getFactroy("M&A"), "M&A Pageの内容");
        System.out.println(pageCreator2.getHtml());
    }
}
