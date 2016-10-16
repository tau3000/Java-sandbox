package strategy;

public class User {
    public static final int TRIAL = 0;
    public static final int NORMAL = 1;
    private boolean isTrial = false;

    public User(int classify) {
        switch (classify) {
        case TRIAL:
            isTrial = true;
            break;
        default:
            break;
        }
    }

    public boolean isTrial() {
        return isTrial;
    }
}
