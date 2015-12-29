package flyweight;

import java.util.*;

public class FlyHumanFactory{

    private Map<String,FlyHuman> map = new HashMap<>();

    private static FlyHumanFactory singleton = new FlyHumanFactory();

    //Singleton
    private FlyHumanFactory() {}

    public static FlyHumanFactory getInstance() {
        return singleton;
    }

    public synchronized FlyHuman getFlyHuman(String name) {
        FlyHuman flyHuman = map.get(name);
        if (flyHuman == null) {
            flyHuman = new FlyHuman(name);
            map.put(name, flyHuman);
        }
        return flyHuman;
    }

}
