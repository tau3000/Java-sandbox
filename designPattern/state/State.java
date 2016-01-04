package state;

public interface State{
    public abstract void expressEmotion(Context context, int condition);
    public abstract void say();
}