package badramda;

public class Ko extends Expresstion{
    // 継承先でオーバーライドして使用する
    @Override
    public String call(int num) {
        return parseNum(num) + "個" + call();
    }

    // 継承先では使用しない
    public String callDesu(int num) {
        throw new UnsupportedOperationException();
    }

    // 継承先では使用しない
    public String callMasu(int num) {
        throw new UnsupportedOperationException();
    }
}
