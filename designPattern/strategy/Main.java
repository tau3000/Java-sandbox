package strategy;

public class Main {

    public static void main(String[] args) {
        // トライアルユーザ向と、通常ユーザでのアルゴリズムを
        // 切り分けるところをStrategyパターンにイメージした
        if (isTrial()) {
            new TrialStrategy().execute();
        } else {
            new NormalUserStrategy().execute();
        }
    }

    // 状態が切り替わるものとする
    private static boolean isTrial() {
        return true;
    }
}
