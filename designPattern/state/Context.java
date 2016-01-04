package state;

public class Context{
    private State state = null;

    public Context(){
        state = AngryState.getInstance();
    }

    public void setState(State state){
        this.state = state;
    }

    public void showCondition(int conditon){
        state.expressEmotion(this, conditon);
    }

    public void showSaying(){
        state.say();
    }
}
