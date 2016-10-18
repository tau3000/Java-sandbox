package bridge;

public class Display {
    protected DiplayMount impl;

    public Display(DiplayMount impl) {
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
