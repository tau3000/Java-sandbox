package observer;

public class ToggleGenerator extends ComponentGenerator {
    public ToggleGenerator(String name) {
        super(name);
        this.state = 0;
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void execute() {
        if (state == 0) {
            state = 1;
        }else{
            state = 0;
        }
        notifyObservers();
    }
}
