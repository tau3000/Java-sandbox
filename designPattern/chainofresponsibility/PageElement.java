package chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class PageElement {
    @Getter private int pageId;

    @Override
    public String toString() {
        return "page_id = " + pageId;
    }
}
