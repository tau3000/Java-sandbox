package chainofresponsibility;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CompanyPageResolver extends AbstractPageResolver {
    private Map<Integer, String> map;

    public CompanyPageResolver() {
        map = new HashMap<>();
        map.put(4, "Company Overview");
        map.put(5, "Company Lookup");
        map.put(6, "Estimates");
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
