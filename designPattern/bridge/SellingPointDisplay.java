package bridge;

public class SellingPointDisplay extends Display {
    public SellingPointDisplay(DiplayMount impl) {
        super(impl);
    }

    @Override
    public void displayText() {
        impl.displayLinkText();
    }
}
