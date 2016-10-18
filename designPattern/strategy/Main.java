package strategy;

public class Main {

    public static void main(String[] args) {
        User trialUser = new User(User.NORMAL);
        
        // トライアルユーザ向と、通常ユーザでのアルゴリズムを
        // 切り分けるところをStrategyパターンにイメージした
        if (trialUser.isTrial()) {
            new TrialUserStrategy().execute();
        } else {
            new NormalUserStrategy().execute();
        }
    }
}
