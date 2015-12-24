package adapter;

public class HatsuneMikuV3 extends HatsuneMikuV2 implements MikuAppend{
    private int cost = 10500;
    public String getSong(){
        return super.getSong();
    }
    public String getSongEnglish(){
        return "Miku, Miku, I’ll make you Miku";
    }

    public void sing(){
        System.out.println(getSong() + "とも歌えるし、");
        System.out.println(getSongEnglish() + "とも歌える");
    }

    public int getCost(){
        return cost;
    }
}