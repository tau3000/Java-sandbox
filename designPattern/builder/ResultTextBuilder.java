package builder;

import java.util.Arrays;
import java.util.List;

public class ResultTextBuilder extends Builder {
    private String firstText;
    private String lastText;

    @Override
    public void makeFirstText() {
        firstText = "「";
    }

    @Override
    public void makeLastText() {
        lastText = "」の検索結果";
    }

    public List<String> getResult() {
        return Arrays.asList(firstText, lastText);
    }
}
