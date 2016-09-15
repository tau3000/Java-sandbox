package adapter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final String url = "https://www.yoshixmk.com/";
        // 今日、昨日、明日
        final List<LocalDate> dayLinks = Arrays.asList(LocalDate.now(), LocalDate.now().minusDays(1), LocalDate.now().plusDays(1));

        for (LocalDate dl : dayLinks) {
            final DayLink dayLink = new DayLink(dl, url);
            System.out.println(dayLink.getDayString());
            final String link = dayLink.getLink();
            if (link.isEmpty()) {
                System.out.println("no link");
            } else {
                System.out.println(link);
            }
        }
    }
}
