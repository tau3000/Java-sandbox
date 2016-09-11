package adapter;

import java.time.LocalDate;

public class DayString {
    LocalDate date;

    public DayString(DayIds id) {
        if (id.equals(DayIds.TODAY)) {
            date = LocalDate.now();
        } else if (id.equals(DayIds.YESTERDAY)) {
            date = LocalDate.now().minusDays(1);
        } else if (id.equals(DayIds.TOMORROW)) {
            date = LocalDate.now().plusDays(1);
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
