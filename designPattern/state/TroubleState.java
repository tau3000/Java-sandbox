package state;

public class TroubleState implements State{
    private static final String stateName = "Trouble";

    //Singletonパターン
    private static State troubleState = new TroubleState();
    private TroubleState(){}
    public static State getInstance(){
        return troubleState;
    }

    public void expressEmotion(Context context, int condition){
        if(condition == 0){
            context.setState(AngryState.getInstance());
            System.out.println("(´・ω・｀;A) ｱｾｱｾ -> (#・∀・)ﾑｶｯ!!");
        }
    }

    public void say(){
        System.out.println("困ったな・・・");
    }
}
