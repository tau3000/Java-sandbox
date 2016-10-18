package strategy;

public class TrialUserStrategy implements UserStrategy {
    @Override
    public void execute() {
        System.out.println("トライアルユーザ向けの処理をする");
    }
}
