package command;

public abstract class Command{
    public void setReceiver(Receiver receiver){}
    public abstract void execute();
}