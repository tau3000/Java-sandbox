package abstractfactory;

public class Main {

    public static void main(String[] args) {
        Page companyPage = new Page("Company Pageの内容");
        AbstractFactory companyPageFactory = new CompanyPageFactory();
        companyPage.addTop(companyPageFactory.getTop());
        companyPage.addBottom(companyPageFactory.getBottom());
        System.out.println(companyPage.getHtml());

        Page dealPage = new Page("M&A Pageの内容");
        AbstractFactory dealPageFactory = new DealPageFactory();
        dealPage.addTop(dealPageFactory.getTop());
        dealPage.addBottom(dealPageFactory.getBottom());
        System.out.println(dealPage.getHtml());
    }
}
