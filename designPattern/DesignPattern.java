import singleton.*;

public class DesignPattern {

    public static void main(String[] args) {
        // ここにデザインパターンのインスタンスを１つ作って実行。
        Singleton instance = new Singleton();
        instance.test();
        System.out.println("Hello World!");
    }
}