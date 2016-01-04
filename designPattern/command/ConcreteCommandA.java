package command;

public class ConcreteCommandA extends Command{
    private int id;
    protected Receiver receiver;
    private final String name = "A";

    public ConcreteCommandA(int id){
        this.id = id;
    }

    public void setReceiver(Receiver receiver){
        this.receiver = receiver;
    }

    public void execute(){
        receiver.action(name + ":" + id);
    }
}