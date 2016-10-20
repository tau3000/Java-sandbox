package chainofresponsibility;

public abstract class AbstractPageResolver {
    private AbstractPageResolver next;

    public AbstractPageResolver setNext(AbstractPageResolver next) {
        this.next = next;
        return next;
    }

    public final void resolve(PageElement e) {
        if (canResolve(e)) {
            done(e);
        } else if (next != null) {
            next.resolve(e);
        } else {
            fail(e);
        }
    }

    public abstract boolean canResolve(PageElement e);

    protected void done(PageElement e) {
        System.out.println("done : " + e);
    }

    protected void fail(PageElement e) {
        System.out.println("fail : " + e);
    }
}
