package command;

public class ConcreteCommandB extends Command{
    private int id;
    protected Receiver receiver;
    private final String name = "B";

    public ConcreteCommandB(int id){
        this.id = id;
    }

    public void setReceiver(Receiver receiver){
        this.receiver = receiver;
    }

    public void execute(){
        receiver.action(name + ":" + id);
    }
}