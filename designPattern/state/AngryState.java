package state;

public class AngryState implements State{
    private static final String stateName = "Angry";

    //Singletonパターン
    private static State angryState = new AngryState();
    private AngryState(){}
    public static State getInstance(){
        return angryState;
    }

    public void expressEmotion(Context context, int condition){
        if(condition == 1){
            context.setState(TroubleState.getInstance());
            System.out.println("(#・∀・)ﾑｶｯ!! -> (´・ω・｀;A) ｱｾｱｾ");
        }
    }

    public void say(){
        System.out.println("もう怒ったぞ！");
    }
}