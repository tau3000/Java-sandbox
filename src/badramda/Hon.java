package badramda;

public class Hon extends Expresstion{
    // 継承先でオーバーライドして使用する
    public String call(int num) {
        return parseNum(num) + "本" + call();
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
