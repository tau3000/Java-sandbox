package singleton;

public class Alone {
    private static final Alone instance = new Alone();

    public static Alone getInstance() {
        return instance;
    }
    // その他、フィールドやメソッド
}
