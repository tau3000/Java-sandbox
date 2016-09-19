package abstractfactory;

public class Main {

    public static void main(String[] args) {
        final PageCreator pageCreator1 = new PageCreator(AbstractFactory.getFactroy("Company"), "Company Pageの内容");
        System.out.println(pageCreator1.getHtml());

        final PageCreator pageCreator2 = new PageCreator(AbstractFactory.getFactroy("M&A"), "M&A Pageの内容");
        System.out.println(pageCreator2.getHtml());
    }
}
