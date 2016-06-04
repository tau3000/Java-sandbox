package ramda;

public class Expresstion {
    //継承先で呼び出しがあるとする
    public String call() {
        return "。";
    }
    
    // 継承先でオーバーライドして使用する
    public String call(int num) {
        return parseNum(num) + "。";
    }

    // 継承先では使用しない
    public String callDesu(int num) {
        return parseNum(num) + "です。";
    }

    // 継承先では使用しない
    public String callMasu(int num) {
        return parseNum(num) + "ます。";
    }

    protected String parseNum(int num) {
        return String.valueOf(num);
    }
}
