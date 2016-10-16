package strategy;

public class TrialStrategy implements AbstractStrategy {
    @Override
    public void execute() {
        System.out.println("トライアルユーザ向けの処理をする");
    }
}
