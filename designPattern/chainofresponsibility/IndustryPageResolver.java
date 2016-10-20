package chainofresponsibility;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IndustryPageResolver extends AbstractPageResolver {
    private Map<Integer, String> map;

    public IndustryPageResolver() {
        map = new HashMap<>();
        map.put(1, "Industry Overview");
        map.put(2, "Industry Lookup");
        map.put(3, "Peer List");
    }

    @Override
    public boolean canResolve(PageElement e) {
        final Set<Integer> pageIdSet = map.keySet();
        if (pageIdSet.contains(e.getPageId())) {
            return true;
        }
        return false;
    }

    @Override
    protected void done(PageElement e) {
        super.done(e);
        System.out.println("\tページ名 : " + map.get(e.getPageId()));
    }
}
