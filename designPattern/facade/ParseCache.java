package facade;

import java.util.List;

public class ParseCache {

    private List<Integer> data;

    public ParseCache(CachedProperties cachedStatsData) {
        data = cachedStatsData.getData();
    }

    public List<Integer> parse() {
        data.remove(0);
        return data;
    }
    
    

}
