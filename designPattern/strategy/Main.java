package strategy;

public class Main {

    public static void main(String[] args) {
        User trialUser = new User(User.TRIAL);
        
        // トライアルユーザ向と、通常ユーザでのアルゴリズムを
        // 切り分けるところをStrategyパターンにイメージした
        if (trialUser.isTrial()) {
            new TrialStrategy().execute();
        } else {
            new NormalUserStrategy().execute();
        }
    }
}
