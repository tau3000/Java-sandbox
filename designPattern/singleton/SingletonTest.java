package singleton;

import java.lang.System;

public class SingletonTest {
    public void test() {
        System.out.println("Singleton Test");
        Alone alone = Alone.getInstance();
    }
}