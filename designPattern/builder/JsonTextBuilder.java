package builder;

import java.util.Arrays;
import java.util.List;

public class JsonTextBuilder extends Builder {
    private String firstText;
    private String lastText;

    @Override
    public void makeFirstText() {
        firstText = "{\"keyword\": [\"";
    }
    
    @Override
    public void makeLastText() {
        lastText = "\"]}";
    }

    public List<String> getResult() {
        return Arrays.asList(firstText, lastText);
    }
}
