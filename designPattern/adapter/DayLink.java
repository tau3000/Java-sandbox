package adapter;

import java.util.ArrayList;
import java.util.Collections;

public class DayLink extends AbstractLink {

    private DayString dayString;

    public DayLink(String id, String template) {
        super(id, template);
        dayString = new DayString(id);
        setLink(id);
    }

    public String getDayString() {
        return dayString.get();
    }

    @Override
    public String createLink(String id) {
        final ArrayList<String> excludeList = new ArrayList<>();
        // 今まではDayStringクラスを使って日付表示だけだったが、
        // システムのバージョンアップに伴って、
        // idが現在より前の時は、Linkを付けることになったとする
        Collections.addAll(excludeList, "tomorrow", "future");

        if (!excludeList.contains(id)) {
            return urlTemplate + dayString.get();
        }
        return "";
    }

}
