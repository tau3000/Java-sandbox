package bridge;

public class Main {
    public static void main(String[] args) {
        // 画像はやりだすと大変なのでStringで代用
        Display display = new Display(new ConcreteDisplayMount("メンテナンス画像", "メンテナンス内容"));
        SellingPointDisplay sellingPointDisplay = new SellingPointDisplay(new ConcreteDisplayMount("お知らせ(予告)画像", "詳細はこちら"));

        display.display();
        sellingPointDisplay.display();
    }
}
