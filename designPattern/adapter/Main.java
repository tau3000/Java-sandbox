package adapter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final String url = "https://www.yoshixmk.com/";
        final List<DayLink> dayLinks =
            Arrays.asList(new DayLink(DayIds.TODAY, url), new DayLink(DayIds.YESTERDAY, url), new DayLink(DayIds.TOMORROW, url));

        for (DayLink dl : dayLinks) {
            final String link = dl.getLink();
            final String dayString = dl.getDayString();
            System.out.println(dayString);
            if (link.isEmpty()) {
                System.out.println("no link");
            } else {
                System.out.println(link);
            }
        }
    }
}
