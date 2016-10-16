package strategy;

public class NormalUserStrategy implements AbstractStrategy {
    @Override
    public void execute() {
        System.out.println("通常ユーザ向けの処理をする");
    }
}
