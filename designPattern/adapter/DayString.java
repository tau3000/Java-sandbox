package adapter;

import java.time.LocalDate;

public class DayString {
    LocalDate date;

    public DayString(LocalDate date) {
        this.date = date;
    }

    public String get() {
        return toString();
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
