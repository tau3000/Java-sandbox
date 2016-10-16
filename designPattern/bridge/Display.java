package bridge;

public class Display {
    protected DiplayImpl impl;

    public Display(DiplayImpl impl) {
        this.impl = impl;
    }

    public void displayImage() {
        impl.displayImage();
    }

    public void displayText() {
        impl.displayText();
    }

    public void display() {
        displayImage();
        displayText();
    }
}
