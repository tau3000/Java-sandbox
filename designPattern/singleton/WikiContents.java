package singleton;

import lombok.Getter;
import lombok.Setter;

public class WikiContents {
    private static final WikiContents instance = new WikiContents();

    @Getter @Setter private String title;
    @Getter @Setter private String content;

    public static WikiContents getInstance() {
        return instance;
    }
}
