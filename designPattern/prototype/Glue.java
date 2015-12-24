package prototype;

import java.lang.System;
import java.util.HashMap;
import java.util.Map;

public class Glue{
    private Map<String, MinionPrototype> hashmap = new HashMap<String, MinionPrototype>();

    public void regist(String key, MinionPrototype minion){
        hashmap.put(key, minion);
        System.out.println("新たにミニオンを登録しました id=" + key);
    }

    public MinionPrototype create(String key){
        MinionPrototype minion = hashmap.get(key);
        System.out.println("ミニオンを増殖させました id=" + key);
        return minion.createClone();
    }
}