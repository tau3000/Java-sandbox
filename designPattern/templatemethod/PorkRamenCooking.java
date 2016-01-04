package templatemethod;

public class PorkRamenCooking extends RamenCooking{
    public void boil(){
        System.out.println("細麺を茹でます");
    }

    public void mix(){
        System.out.println("豚骨ベースのスープを用意します");
    }

    public void putTopping(){
        System.out.println("チャーシュー、キクラゲ、紅生薑をトッピングします");
    }
}