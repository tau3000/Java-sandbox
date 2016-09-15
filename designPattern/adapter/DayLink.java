package adapter;

import java.time.LocalDate;

public class DayLink extends AbstractLink {

    private DayString dayString;
    private LocalDate date;

    public DayLink(LocalDate date, String template) {
        super(template);
        dayString = new DayString(date);
        this.date = date;
        setLink(date.toString());
    }

    public String getDayString() {
        return dayString.get();
    }

    @Override
    public String createLink(String link) {
        // 今まではDayStringクラスを使って日付表示だけだったが、
        // システムのバージョンアップに伴って、
        // idが現在より前の時は、Linkを付けることになったとする
        final LocalDate now = LocalDate.now();
        if (date.compareTo(now) <= 0) {
            return urlTemplate + dayString.get();
        }
        return "";
    }
}
