package chainofresponsibility;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SpecialPageResolver extends AbstractPageResolver {
    private int pageId;
    private String pageName;

    @Override
    public boolean canResolve(PageElement e) {
        if (pageId == e.getPageId()) {
            return true;
        }
        return false;
    }

    @Override
    protected void done(PageElement e) {
        super.done(e);
        System.out.println("\tページ名 : " + pageName);
    }
}
