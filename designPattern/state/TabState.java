package state;

public interface TabState{
    public abstract void doClick(TabContext context, int condition);
    public abstract void show();
}