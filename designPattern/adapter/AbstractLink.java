package adapter;

import java.util.HashMap;
import java.util.Map;

abstract class AbstractLink {
    
    protected String urlTemplate;

    protected Map<MapKeys, String> resultMap = new HashMap<>();

    protected DayString dayString;

    public AbstractLink(String id, String template) {
        dayString = new DayString(id);
        urlTemplate = template;
    }

    public void setLink(String id) {
        resultMap.put(MapKeys.LINK, createLink(id));
    }

    public Map<MapKeys, String> getLink() {
        return resultMap;
    }

    abstract String createLink(String id);

}
