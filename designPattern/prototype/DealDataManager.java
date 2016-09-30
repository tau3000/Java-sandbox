package prototype;

import java.util.HashMap;

public class DealDataManager {
    private HashMap<String, DealData> showcase = new HashMap<>();

    public void register(String name, DealData proto) {
        showcase.put(name, proto);
    }

    public DealData create(String protoname) {
        DealData dealData = (DealData) showcase.get(protoname);
        return dealData.createClone();
    }
}
