package bridge;

public class SellingPointDisplay extends Display {
    public SellingPointDisplay(DiplayImpl impl) {
        super(impl);
    }

    @Override
    public void displayText() {
        impl.displayLinkText();
    }
}
