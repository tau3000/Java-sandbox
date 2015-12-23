package singleton;

import java.lang.System;

public class SingletonTest {
    public void test() {
        System.out.println("Singleton Test");
        Alone alone1 = Alone.getInstance();
        Alone alone2 = Alone.getInstance();
        if(alone1 == alone2){
            System.out.println("同じクリぼっちでした。");
        }
    }
}