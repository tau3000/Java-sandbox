package chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        AbstractPageResolver industryResolver = new IndustryPageResolver();
        AbstractPageResolver companyResolver = new CompanyPageResolver();
        AbstractPageResolver targetList = new SpecialPageResolver(7, "Target List");
        industryResolver.setNext(companyResolver).setNext(targetList);

        industryResolver.resolve(new PageElement(1));
        industryResolver.resolve(new PageElement(5));
        industryResolver.resolve(new PageElement(7));
        industryResolver.resolve(new PageElement(100));
    }

}
