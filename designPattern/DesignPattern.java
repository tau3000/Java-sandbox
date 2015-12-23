import singleton.*;

public class DesignPattern {

    public static void main(String[] args) {
        // ここにデザインパターンのインスタンスを１つ作って実行。
        SingletonTest instance = new SingletonTest();
        instance.test();
        System.out.println("Hello World!");
    }
}