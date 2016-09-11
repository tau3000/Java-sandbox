package adapter;

import java.time.LocalDate;

public class DayString {
    LocalDate date;

    public DayString(String id) {
        if (id.equals("today")) {
            date = LocalDate.now();
        } else if (id.equals("yesterday")) {
            date = LocalDate.now().minusDays(1);
        } else if (id.equals("tomorrow")) {
            date = LocalDate.now().plusDays(1);
        } else if (id.equals("future")) {
            date = LocalDate.MAX;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String get() {
        return toString();
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
