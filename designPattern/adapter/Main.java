package adapter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        final String url = "https://www.yoshixmk.com/";
        final DayLink today = new DayLink("today", url);
        final DayLink yesterday = new DayLink("yesterday", url);
        final DayLink tomorrow = new DayLink("tomorrow", url);
        final DayLink future = new DayLink("future", url);

        final List<DayLink> dayLinks = Arrays.asList(today, yesterday, tomorrow, future);

        for (DayLink dl : dayLinks) {
            final Map<MapKeys, String> link = dl.getLink();
            System.out.println(link.get(MapKeys.DAY));
            if(link.get(MapKeys.LINK).isEmpty()){
                System.out.println("no link");
            } else{
                System.out.println(link.get(MapKeys.LINK));
            }
        }
    }
}
