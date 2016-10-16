package bridge;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(new ConcreteDisplayImpl("メンテナンス画像", "メンテナンス内容"));
        SellingPointDisplay sellingPointDisplay = new SellingPointDisplay(new ConcreteDisplayImpl("お知らせ(予告)画像", "詳細はこちら"));

        display.display();
        sellingPointDisplay.display();
    }
}
