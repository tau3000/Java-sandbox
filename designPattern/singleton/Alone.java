package singleton;

import java.lang.System;

public class Alone{
    private static final Alone instance = new Alone();

    private Alone() {
        System.out.println("クリぼっちが生まれました");
    }

    public static Alone getInstance(){
        return instance;
    }
    //その他、フィールドやメソッド
}