package bridge;

public class ConcreteDisplayMount implements DiplayMount {
    private String imageName;
    private String text;

    public ConcreteDisplayMount(String imageName, String text) {
        this.imageName = imageName;
        this.text = text;
    }

    @Override
    public void displayImage() {
        System.out.println(imageName);
    }

    @Override
    public void displayText() {
        System.out.println(text);
    }

    @Override
    public void displayLinkText() {
        System.out.println(text);

    }
}
