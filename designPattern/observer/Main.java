package observer;

public class Main {

    public static void main(String[] args) {
        final ComponentGenerator industryToggleGenerator = new ToggleGenerator("業界");
        final Observer toggleObserver = new ToggleObserver();
        industryToggleGenerator.addObserver(toggleObserver);
        industryToggleGenerator.execute();
        
        final ComponentGenerator companyToggleGenerator = new ToggleGenerator("企業");
        companyToggleGenerator.addObserver(toggleObserver);
        companyToggleGenerator.execute();
    }
}
