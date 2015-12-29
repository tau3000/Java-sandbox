package flyweight;

import java.lang.System;

public class FlyweightTest{
    public void test() {
        System.out.println("Flyweight Test");

        FlyHumanFactory flyHumanFactory = FlyHumanFactory.getInstance();

        String[] name = new String[]{"I", "We", "You", "I", "We"};

        for (int i = 0; i < name.length; i++) {
            FlyHuman flyHuman = flyHumanFactory.getFlyHuman(name[i]);
            flyHuman.say();
        }
    }
}