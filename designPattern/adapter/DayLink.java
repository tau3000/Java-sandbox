package adapter;

import java.util.HashSet;
import java.util.Set;

public class DayLink extends AbstractLink {

    private DayString dayString;

    public DayLink(DayIds id, String template) {
        super(id, template);
        dayString = new DayString(id);
        setLink(id);
    }

    public String getDayString() {
        return dayString.get();
    }

    @Override
    public String createLink(DayIds id) {
        final Set<DayIds> excludeSet = new HashSet<>();
        // 今まではDayStringクラスを使って日付表示だけだったが、
        // システムのバージョンアップに伴って、
        // idが現在より前の時は、Linkを付けることになったとする
        excludeSet.add(DayIds.YESTERDAY);

        if (!excludeSet.contains(id)) {
            return urlTemplate + dayString.get();
        }
        return "";
    }

}
