package state;

public interface Context {
    public void changeState(TabState state);

    public void doClick(int conditon);
}
